import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        Arrays.setAll(array, i -> sc.nextInt());
        Arrays.sort(array);
        boolean[] dp = new boolean[array[n - 1] + 1];
        Arrays.fill(dp, true);
        for (int i = 0; i < n; i++) {
            int v = array[i];
            if (i > 0 && array[i] == array[i - 1]) {
                dp[v] = false;
                continue;
            }
            for (int j = 2; j * v <= array[n - 1]; j++) {
                dp[j * v] = false;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (dp[array[i]]) {
                count++;
            }
        }
        System.out.println(count);
    }
}