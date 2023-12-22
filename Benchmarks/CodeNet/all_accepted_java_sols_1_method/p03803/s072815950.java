import java.io.IOException;
import java.util.Scanner;

/**
 * Created by zzt on 17-2-11.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b) {
            if (a == 1)
                System.out.println("Alice");
            else
                System.out.println("Bob");
        } else if (a == b)
            System.out.println("Draw");
        else {
            if (b == 1)
                System.out.println("Bob");
            else
                System.out.println("Alice");
        }
    }
}