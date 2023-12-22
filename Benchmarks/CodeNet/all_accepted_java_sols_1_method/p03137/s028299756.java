

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long sum = 0;
        long [] x = new long[m];
        for (int i = 0 ;i < m; ++i) {
            x[i] = scanner.nextLong();
        }
        if (n >= m) {
            System.out.println(0);
            return;
        }
        Arrays.sort(x);
        sum = x[m - 1] - x[0];
        PriorityQueue<Long> diff = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 1; i < m; ++i) {
            long currentDiff = x[i] - x[i - 1];
            diff.add(currentDiff);
        }
        for (int i = 0; i < n - 1; ++i) {
            long currentDiff = diff.poll();
            sum -= currentDiff;
        }
        System.out.println(sum);


    }

}
