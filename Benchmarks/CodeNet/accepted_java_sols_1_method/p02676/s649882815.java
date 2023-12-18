import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        String string = scanner.next();

        int wordCount = string.length();

        if (number < wordCount) {
            String cuttingWord = string.substring(0,number);
            cuttingWord += "...";
            System.out.println(cuttingWord);
        } else {
            System.out.println(string);
        }
    }
}
