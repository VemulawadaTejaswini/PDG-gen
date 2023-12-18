import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = -k + 1; i <= k - 1 ; i++) {
            if(-1000000 < x+i && x+i < 1000000)
                System.out.print(x+i + " ");
        }
    }
}

