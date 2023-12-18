/*
Written by Kabir Kanha Arora
@kabirkanha
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] factors = new long[N + 1];
        for (int i = 1; i <= N; ++i) {
            for (int j = i; j <= N; j += i) {
                factors[j]++;
            }
        }
        long sum = 0;
        for (int i = 1; i <= N; ++i) {
            sum += (i * factors[i]);
        }
        System.out.println(sum);
    }
}
