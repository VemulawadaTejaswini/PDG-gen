
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            for (int x = 0; n > x; x++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                if (a == 100 || b == 100 | c == 100 || (a + b + c) / 3 >= 80 || (a + b) / 2 >= 90) {
                    System.out.println("A");
                } else if ((a + b + c) / 3 >= 70 || (a + b + c) / 3 >= 50 && a >= 80 || b >= 80) {
                    System.out.println("B");
                } else {
                    System.out.println("C");
                }
            }
            n = scanner.nextInt();
        }
    }
}

