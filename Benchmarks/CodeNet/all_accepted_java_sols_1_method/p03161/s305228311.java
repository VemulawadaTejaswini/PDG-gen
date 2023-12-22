import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] hights = new int[n];
        long[] memo = new long[n];
        Arrays.fill(memo, Long.MAX_VALUE);
        memo[0] = 0;
        hights[0] = in.nextInt();
        for (int i = 1; i < n; i++) {
            hights[i] = in.nextInt();
            for (int j = Math.max(i - k, 0); j < i; j++) {
                memo[i] = Math.min(memo[i], (Math.abs(hights[i] - hights[j]) + memo[j]));
            }
        }
        in.close();
        System.out.println(memo[n-1]);
    }
}