// package atcoder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final int X = in.nextInt();
        final int Y = in.nextInt();

        for (int k = 0; k <= X; ++k) {
            if (2*k + 4*(X - k) == Y) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
