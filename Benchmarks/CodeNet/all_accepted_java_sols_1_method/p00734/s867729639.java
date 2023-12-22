

import java.util.Scanner;
import java.util.stream.IntStream;

class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            boolean findAble = false;

            if (n + m == 0) break;

            int[] ns = new int[n];
            int[] ms = new int[m];

            for (int i = 0; i < n; i++) {
                ns[i] = scanner.nextInt();
            }

            for (int i = 0; i < m; i++) {
                ms[i] = scanner.nextInt();
            }

            int sumN = IntStream.of(ns).sum();
            int sumM = IntStream.of(ms).sum();

            OUT:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (sumN - ns[i] + ms[j]  == sumM - ms[j] + ns[i] ) {
                        System.out.println(ns[i] + " " + ms[j]);
                        findAble = true;
                        break OUT;
                    }
                }
            }
            if (!findAble) {
                System.out.println("-1");
            }

        }
    }
}

