import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String str = scanner.nextLine();

        final String str_reverse = reverse(str);

        System.out.println(str_reverse);
    }

    static String reverse (String str) {
        String result = "";

        final int SIZE = str.length();
        for (int i = SIZE - 1; i >= 0; i--) {
            result += str.substring(i, i + 1);
        }

        return result;
    }

}