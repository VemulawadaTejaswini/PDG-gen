import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                System.out.print((char)(c - ('A' - 'a')));
            } else if (c >= 'a' && c <= 'z') {
                System.out.print((char)(c - ('a' - 'A')));
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}
