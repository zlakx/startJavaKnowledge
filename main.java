public class main {
    public static void main(String[] args) {
        System.out.println("Сделайте вид, что я тут написал что-то умное:");
        System.out.println("Абстрактно видят мир только писатели, а я что писатель, я человек, который пытается что-то придумать");
        // Выше тест println
        System.out.print("Проверим как работает print ");
        System.out.print("произойдет ли конкатенация? ");
        System.out.println("Опытным путем, я выяснил, что да"); // Проверил print, который привел к конкатенации
        System.out.println("Если хочется написать все с конкатенацией, то пиши print, а без неё, пиши через println");
        System.out.println("На всякий случай, всегда проверяй наличие ; в конце кода, спасибо");
        // Ну с числами и конкатенацией я всё рассказал, пошли дальше
        System.out.println(0);
        System.out.println(333);
        System.out.println(13);
        System.out.println("Писать числа нужно без верхних двойных скобок :>, ну и все вычисления математические тоже без кавычек");
        // Я знал про то, что комментарии можно ставить между кодом, около кода, так что ничего нового
        /* А вот тебе и что-то новое или забытое старое, мульти комментарии (ну когда на несколько строк)
        Тут я могу продолжить писать дальше тебе комментарий, используя связку звезды и слеша
        Я не проверял, но думаю, что можно делать очень большой комментарий
        Ну или использовать удобные комментарии, так как короткие предложения читаются легче */
        String name = "John"; // Пример с объявление переменной, ну тут понятно
        System.out.println(name);
        int myNum = 15; // Ну как же без примера с цифрами
        System.out.println(myNum);
        /* Вот это обычная штука, но полезная 
        Создал переменную, а используешь её позже, записываешь в неё значение и работаешь с ним*/
        int myNumberForTest;
        myNumberForTest = 13;
        System.out.println(myNumberForTest);
        // Чтоб проще было, второй тест с цифрами 
        int myNumberForSecondTest = 133;
        myNumberForSecondTest = 10;
        System.out.println(myNumberForSecondTest); // Я взял её и перезаписал, потому что код идёт последовательно, тоесть я зачернул прошлое и написал новое
        // Сейчас покажу как это залочить, ну или чтоб было проще запомнить, зафиналить
        final int myNumberForThirdTest = 89;
        // myNumberForThirdTest = 13; // Данный код приведет к ошибке, что перезаписать не может, поэтому я его закоменчу, иначе код не работает :>
        System.out.println(myNumberForThirdTest);
        /* Короче
        Насру тебе примеров типов, которые есть в java
        Просто посмотри, чтоб не забыть */
        int myNumber = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        // Как комбинировать текст и переменную:
        String authorName = "Zlakx";
        System.out.println("Привет, я " + authorName); // Вприниципе ты уже это знал, но вспомнить это хорошо
        // Ну так и можно целый текст с использование переменных создать
        String girlfriendName = "Chaplucky";
        String pair = authorName + " " + girlfriendName;
        System.out.println(pair); // Короче автор встречается с Chaplucky, ну и так до бесконечности можно составить текст
        // Посчитаем сколько будет 7 + 6
        int x = 7;
        int y = 6;
        System.out.println(x + y); // Любимое число автора получилось
        // Делать список можно, когда одинаковый тип, выше я числа писал в разных строках, а теперь всё уместить могу в одну
        int z = 4, l = 6, a = 3;
        System.out.println(z + l + a); // Любимое число автора вышло 
        // Если тебе нужно одинаковое число записать в какие-то переменные, то смотри
        int k, i, some;
        k = i = some = 13;
        System.out.println(k + i + some); // Получается любимое число в кубе

        // Главная штука, чтоб было проще, использовать английские слова и обозначения чего угодно на нём, показываю
        int daysPerWeek = 7; // Более чем понятно
        int d = 7; // Пока эта переменная тут, понять ещё можно, а если таких будет много, ты не поймёшь что тут было и зачем

        /* Прям с сайта, где учу java вставлю(учи английский, чтоб понять что написано, ну или переводчик используй)
         The general rules for naming variables are:
         
         Names can contain letters, digits, underscores, and dollar signs
         Names must begin with a letter
         Names should start with a lowercase letter, and cannot contain whitespace
         Names can also begin with $ and _
         Names are case-sensitive ("myVar" and "myvar" are different variables)
         Reserved words (like Java keywords, such as int or boolean) cannot be used as names */


        // Я тут ещё код вставлю(пример), чтоб увидеть пример, что и как можно использовать для обозначения переменных

        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        // И второй пример

        // Create integer variables
        int length = 4;
        int width = 6;
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);

        // Есть два типа информации(Data), примитивная(byte, short, int, long, float, double, boolean and char) и не примитивная (String, Arrays and Classes)

        /*
         И есть такая табличка примитивной data
         byte  - Stores whole numbers from -128 to 127
         short - Stores whole numbers from -32,768 to 32,767
         int - Stores whole numbers from -2,147,483,648 to 2,147,483,647
         long - Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         float - Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
         double - Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
         boolean - Stores true or false values
         char - Stores a single character/letter or ASCII values
         Будем надеяться, что не тебе не мне сейчас она не понадобятся, но мы знаем где её найти, если нужна будет */

        byte aboutByteNumber = 100; // Смотри в таблицу, поймёшь почему тут 100, ну и такой прием позволяет сохранить память если тебе нужны только числа из байта
        System.out.println(aboutByteNumber);

        short aboutShortNumber = 5000; // Тут тоже смотри в таблицу, причина для чего это сделано, не меняется
        System.out.println(aboutShortNumber);

        int aboutIntNumber = 100000; // Самое популярное, достаточно чисел
        System.out.println(aboutIntNumber);

        long aboutLongNumber = 15000000000L; // Очень много чисел, если тебе когда-то придется это использовать, то завершай такое число буквой L
        System.out.println(aboutLongNumber);

        float aboutFloatNumber = 5.75f; // Тут число с десятичным значением, которое завершаем буквой f
        System.out.println(aboutFloatNumber);

        double aboutDoubleNumber = 19.99d; // А тут тоже число с десятичным значением, которое завершаем буквой d
        System.out.println(aboutDoubleNumber);
        // Не особо понял почему, но для безопасного вычисления использовать лучше double

        // Число с плавающей запятой также может быть научным числом с буквой "е", обозначающей степень 10
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        // Очень часто нужна логика в программировании(для тестирования условий), поэтому используется в Java булевый тип для таких дел
        boolean myGirlfriendLovesMe = true;
        boolean imLonely = false;
        System.out.println(myGirlfriendLovesMe); // Моя девушка меня и правда любит
        System.out.println(imLonely); // Я не одинок 
        // Пример как он задается, а не как используется

        // Пример Char, ну просто чтоб был 
        char myGrade = 'B';
        System.out.println(myGrade);

        // ASCII - таблица со значениями, которые можно использовать, пока я её не знаю, поэтому ты тоже лезь туда
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;        
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        
        /* String - тоесть строка, содержит в себе последовательность символов
        Их нужно ставить в двойные кавычки (ну в будущем, ещё станет известно, что можно использовать и одинарные) */

        // Пример, как можно использовать различные типы информации
        int itemsInStore = 13;
        float costPerItem = 999.99f; 
        float totalCost = itemsInStore * costPerItem;
        char currency = '€';

        System.out.println("Количество товаров в магазине: " + itemsInStore);
        System.out.println("Цена за товар " + costPerItem + currency);
        System.out.println("Общая стоимость = " + totalCost + currency);



        /*
         1. Widening Casting (automatically) - перевод из малого в большее
         2. Narrowing Casting (manually) - перевод из большего в меньшее
         */

        // Пример первого - где автоматически происходит перевод
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        // Пример второго - где перевод нужно осуществлять вручную, используя ()
        double mySecondDouble = 9.78d;
        int mySecondInt = (int) mySecondDouble;

        System.out.println(mySecondDouble);
        System.out.println(mySecondInt);

        // Программа для вычисления процентов очков человека, относительно максимальных очков
        int maxScore = 1000;
        int userScore = 555;
        float percentage = (float) userScore / maxScore * 100.0f; // Число переводится в плавающее, чтоб точно определить количество процентов
        
        System.out.println("Процент очков пользователя - " + percentage);

        /*
         В Java есть операторы арифметики, присваивания, сравнения, логические и какие-то побитовые
         Самое первое, операторы арифметики
         + складывает
         - вычитает
         * умножает
         / делит
         % деление с остатком
         ++ увеличивает значение на 1
         -- уменьшает значение на 1 
         Считаю тут примеры не нужны и так понятно
         */

        /*
         Второе, операторы присваивания
         = присвоить
         += присвоить и прибавить какое-то число (возможно и не число, но не помню, сам проверь)
         -= присвоить и вычесть
         *= присвоить и умножить
         /= присвоить и поделить
         %= присвоить и поделить с остатком
         &= сам не понял, что он делает, но пусть тут тоже будет
         |= тут тоже не разобрался, пойми сам и можешь мне рассказать
         ^= в степень
         >>= больше
         <<= меньше
         Примеры добавлю потом, если не забуду, если не добавил, значит забыл, сам сделай, чтоб понятнее было
         */


        /*
         Третье, операторы сравнения
         == равно
         != не равно
         > больше (при сравнении)
         < меньше (при сравнении)
         >= больше или равно
         <= меньше или равно
         Тут тоже примеры добавлю потом, если не забуду, если не добавил, значит забыл, сам сделай
         */

        /*
         Третье, логические операторы
         && логическое и
         || логическое или 
         ! логическое не
         Тут тоже примеры добавлю потом, если не забуду, если не добавил, значит забыл, сам сделай
         */

        // В типе String есть полезное вычисление длинны строки, используя метод: .length()
        String txtForLength = "QWERTYUIOASDFGHJKZXCVBNM";
        System.out.println("Длинна текста: " + txtForLength.length());

        // Ещё пара методов, которые делают текст верхнего регистра .toUpperCase() и нижнего регистра .toLowerCase()
        String txtForUpperAndLowerCase = "Java - язык программирования";
        System.out.println(txtForUpperAndLowerCase.toUpperCase());
        System.out.println(txtForUpperAndLowerCase.toLowerCase());
        
        // Метод поиска символа в тексте (выведет значение в строке, где начинается слово(учти, что в Java счет идет с 0))
        String txtForFindCharacter = "Поиск слова, которое тебе необходимо";
        System.out.println(txtForFindCharacter.indexOf("тебе"));

        // Моя любимая конкатенация, когда используется + в выводе переменных, например:
        String audioInput = "Микрофон";
        String audioOutput = "Наушники";
        System.out.println(audioInput + " и " + audioOutput + " - это гарнитура"); // Чтоб текст не склеивался полностью используют " ", где пробел ставится внутри скобок, как разделитель

        // Метод .concat() - такая же конкатенация, но через метод. Использовал строки, которые были созданы для конкатенации
        System.out.println(audioInput.concat(audioOutput));

        /* ВАЖНО
         В Java + используется как оператор сложения, так и как оператор конкатенации, но сложения только чисел, а конкатенация для строк
        */
        int exampleAdditionNumberFirst = 7;
        int exampleAdditionNumberSecond = 6;
        System.out.println(exampleAdditionNumberFirst + exampleAdditionNumberSecond); // Получится число (int) 13

        String exampleConcatFirstLetter = "7";
        String exampleConcatSecondLetter = "6";
        System.out.println(exampleConcatFirstLetter + exampleConcatSecondLetter); // Получится строка (String) 76, это важно учитывать, что строки соединяются, а не складываются

        String exampleConcatAndAdditionFirsts = exampleConcatFirstLetter + exampleAdditionNumberFirst; // Используя String значение числовое (int) переводится в строку
        System.out.println(exampleConcatAndAdditionFirsts); // Из-за чего выводится строка с конкатенацией

        /* Тут будет прикольная штука, которую нужно знать
         Обратный слеш ( \ ), экранизирует специальные знаки, по типу "",'' и иных
         String txt = "Что-то тут написано "абстрактно", а ты даже не знаешь про что."
         Используй в таких случаях обратный слеш перед знаками, которые тебе необходимо написать в сообщении
         String txt = "Что-то тут написано \"абстрактно\", а ты даже не знаешь про что."
        */
        String exampleTxtBackslash  = "Скандинавские мореходы, совершавшие в VIII-XI веках морские походы были - \"Викинги\"";
        System.out.println(exampleTxtBackslash);

        /* Также этот экранирующий символ можно спользовать в следующих комбинациях
         \n - начинается текст с новой строки
         \r - похож на прошлое, тоже возвращает текст к новой строке (но в примере не понятно)
         \t - делает табуляцию ("нажимает" на Tab)
         \b - удаляет символ, стоящий перед такой кобинацией
         \f - делает "разрыв страницы"
         */

         String exampleTxtEscapingN = "Консультация с профессионалами из IT \nспособствует повышению актуальности";
         System.out.println(exampleTxtEscapingN);

         String exampleTxtEscapingR = "Консультация с профессионалами из IT \rспособствует повышению актуальности";
         System.out.println(exampleTxtEscapingR);

         String exampleTxtEscapingT = "Консультация с профессионалами из IT \tспособствует повышению актуальности";
         System.out.println(exampleTxtEscapingT);

         String exampleTxtEscapingB = "Консультация с профессионалами из IT с\bпособствует повышению актуальности";
         System.out.println(exampleTxtEscapingB);

         String exampleTxtEscapingF = "Консультация с профессионалами из IT \fспособствует повышению актуальности";
         System.out.println(exampleTxtEscapingF);


        // Математические методы, для работы с числами
        System.out.println(Math.max(6,13)); // Поиск наибольшего числа из двух заданных
        System.out.println(Math.min(6, 13)); // Поиск наименьшего числа из двух заданных
        System.out.println(Math.sqrt(64)); // Вычисление квадратного корня из числа
        System.out.println(Math.abs(-13.3)); // Вычисляет модуль(абсолютное значение) из числа
        System.out.println(Math.random()); // Возвращает рандомное число из значение 0.0 (включительно) и 1.0 (исключительно)
        // Чтоб получить число от 0 до 100, можно воспользоваться данной формулой
        int randomNum = (int)(Math.random() * 51); // Учитывай, что в диапазоне будут числа от 0 до 51 (не включая 51)
        System.out.println(randomNum);


        
    }
}

