

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int X = A * B;
            int Y = C * D;
            if ( X > Y ) {
                System.out.println(X);
            } else {
                System.out.println(Y);
            }
        }
    }
}
