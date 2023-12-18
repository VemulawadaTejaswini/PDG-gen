import java.util.*;

public class Main {
    static String target;
    static String base;
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        base = sc.next();
        target = sc.next();
        dp = new int[base.length()][target.length()];
        for (int[] arr : dp) {
            Arrays.fill(arr, Integer.MIN_VALUE);
        }
        System.out.println(getLength(0, 0));
    }
    
    static int getLength(int idx, int tidx) {
        if (tidx >= target.length()) {
            return base.length() - idx;
        }
        if (idx >= base.length()) {
            return target.length() - tidx;
        }
        if (dp[idx][tidx] >= 0) {
            return dp[idx][tidx];
        }
        if (base.charAt(idx) == target.charAt(tidx)) {
            return dp[idx][tidx] = getLength(idx + 1, tidx + 1);
        }
        return dp[idx][tidx] = Math.min(getLength(idx + 1, tidx + 1) + 1, Math.min(getLength(idx, tidx + 1) + 1, getLength(idx + 1, tidx) + 1));
    }
}
