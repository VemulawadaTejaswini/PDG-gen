

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int q = scanner.nextInt();
        long [] shines = new long[a];
        long [] temples = new long[b];
        long[] query = new long[q];
        for (int i = 0; i < a; ++i) {
            shines[i] = scanner.nextLong();
        }
        for (int i = 0; i < b; ++i) {
            temples[i] = scanner.nextLong();
        }
        for (int i = 0; i < q; ++i) {
            query[i] = scanner.nextLong();
        }
        Arrays.sort(shines);
        Arrays.sort(temples);

        for (int j = 0; j < q; ++j) {
            int shineIndex = -(Arrays.binarySearch(shines, query[j]) + 1);
            int templeIndex = -(Arrays.binarySearch(temples, query[j]) + 1);
            long res = Long.MAX_VALUE;
            // ab x
            if (shineIndex -1 >= 0 && templeIndex - 1 >= 0) {
                long current = Math.max(query[j] - shines[shineIndex - 1], query[j] - temples[templeIndex - 1]);
                res = Math.min(res, current);
            }

            // x ab
            if (shineIndex < a && templeIndex < b) {
                long current = Math.max(shines[shineIndex] - query[j], temples[templeIndex] - query[j]);
                res = Math.min(res, current);
            }


            // a x b
            if (shineIndex - 1 >= 0 && templeIndex < b) {
                long current1 = temples[templeIndex] - shines[shineIndex - 1] +
                        query[j] - shines[shineIndex - 1];
                long current2 = temples[templeIndex] - shines[shineIndex - 1] +
                        temples[templeIndex] - query[j];
                long current = Math.min(current1, current2);
                res = Math.min(res, current);

            }

            // b x a
            if (templeIndex - 1 >= 0 && shineIndex < a) {
                long current1 = shines[shineIndex] - temples[templeIndex - 1] +
                        query[j] - temples[templeIndex - 1];
                long current2 = shines[shineIndex] - temples[templeIndex - 1] +
                        shines[shineIndex] - query[j];
                long current = Math.min(current1, current2);
                res = Math.min(res, current);
            }
            System.out.println(res);
        }
    }


}
