

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] arr = new long[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long min = Integer.MAX_VALUE;
        for(int i = 0; i < N - K + 1; i++) {
            long tmp = arr[i+K-1] - arr[i];
            min = Math.min(min, tmp);
        }
        System.out.println(min);
    }
}
