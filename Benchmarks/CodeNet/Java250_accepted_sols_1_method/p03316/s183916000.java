

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int inputx = sc.nextInt();
            int x = inputx;
            int sum = 0;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            if ( inputx % sum == 0 ) {
                System.out.println("Yes");
            } else {
                System.out.println("No");

            }
        }
    }
}
