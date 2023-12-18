

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n==0) break;
            int length = n * (n - 1) / 2;
            int sum = 0;
            for (int i = 0; i < length; i++) {
               sum += sc.nextInt();
            }
            System.out.println(sum/(n-1));
        }

    }
}


