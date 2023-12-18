/*
Written by Kabir Kanha Arora
@kabirkanha
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long K = scanner.nextLong();
        long[] arr_A = new long[N];
        long[] arr_B = new long[M];
        for (int i = 0; i < N; ++i) {
            arr_A[i] = scanner.nextLong();
        }
        for (int i = 0; i < M; ++i) {
            arr_B[i] = scanner.nextLong();
        }
        int cnt = 0;
        long sum = 0;
        for (int i = 0; i < N; ++i) {
            if (sum + arr_A[i] > K)
                break;
            sum += arr_A[i];
            cnt++;
        }
        int marker = cnt - 1;
        int j = 0;
        for (; j < M; ++j) {
            if (sum + arr_B[j] > K)
                break;
            sum += arr_B[j];
            cnt++;
        }
        int max = cnt;
        for (int i = marker; i >= 0; --i) {
            sum -= arr_A[i];
            --cnt;
            while (j < M && sum + arr_B[j] <= K) {
                sum += arr_B[j];
                ++j;
                ++cnt;
                max = Math.max(max, cnt);
            }
        }
        System.out.println(max);
    }
}
