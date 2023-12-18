import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String[] s = str.split("");
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        int left = 0;
        int right = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].equals("E"))
                right++;
        }
        dp[0] = right;
        for (int i = 1; i < n; i++) {
            if (s[i - 1].equals("W"))
                left++;
            if (s[i].equals("E"))
                right--;
            dp[i] = left + right;
        }
        Arrays.sort(dp);
        System.out.println(dp[0]);
    }
}
