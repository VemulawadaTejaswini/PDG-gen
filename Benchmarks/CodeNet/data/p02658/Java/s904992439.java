

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] a = new long[N];
        long result = 1;

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();

            if (a[i] == 0) {
                System.out.println(0);
                return;
            }

            try {
                result *= a[i];
            } catch (Exception e) {
                System.out.println(-1);
                return;
            }

        }

        System.out.println(result <= 1000000000000000000L ? result : -1);

    }
}
