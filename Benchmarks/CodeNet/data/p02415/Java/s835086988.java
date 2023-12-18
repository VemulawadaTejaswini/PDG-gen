
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int offset = 'a' - 'A';
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('A' <= c && c <= 'Z') {
                System.out.print((char)(c + offset));
            } else if ('a' <= c && c <= 'z') {
                System.out.print((char)(c - offset));
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
        scanner.close();
    }
}

