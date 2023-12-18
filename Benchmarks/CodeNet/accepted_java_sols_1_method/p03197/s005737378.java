

import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        final Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; ++i) {
            int num = scanner.nextInt();
            if (num % 2 == 1) {
                System.out.println("first");
                return;
            }
        }

        System.out.println("second");

    }
}
