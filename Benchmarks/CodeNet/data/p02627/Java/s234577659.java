
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        char c = a.toCharArray()[0];
        if ('A' <= c && c <= 'Z') {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}
