import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = max(a+b, a-b);
        max = max(max, a*b);

        System.out.println(max);

    }
}

