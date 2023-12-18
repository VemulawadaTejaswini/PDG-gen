

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n1 = in.nextInt();
        final int n2 = in.nextInt();
        final int k = in.nextInt();
        in.nextLine();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = in.nextInt();
        }
        in.nextLine();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = in.nextInt();
        }
        in.nextLine();
        System.out.println(dfs(a, 0, b, 0, k, new Integer[n1+1][n2+1]));
    }

    private static int dfs(int[] a, int aIdx, int[] b, int bIdx, int k, Integer[][] dp) {
        if (aIdx < a.length && bIdx < b.length && k < a[aIdx] && k < b[bIdx]) {
            return 0;
        }
        if (dp[aIdx][bIdx] != null) {
            return dp[aIdx][bIdx];
        }
        int takeA = 0;
        if (aIdx < a.length && a[aIdx] <= k) {
            takeA = 1 + dfs(a, aIdx + 1, b, bIdx, k - a[aIdx], dp);
        }
        int takeB = 0;
        if (bIdx < b.length && b[bIdx] <= k) {
            takeB = 1 + dfs(a, aIdx, b, bIdx + 1, k - b[bIdx], dp);
        }
        return dp[aIdx][bIdx] = Math.max(takeA, takeB);
    }

}
