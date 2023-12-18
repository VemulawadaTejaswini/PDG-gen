import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] balls = new int[n + 1]; // 直感的に扱うために1個多めに確保

        for (int i = 0; i < n; i++) {
            balls[sc.nextInt()]++; // こういう書き方もできる
        }

        Arrays.sort(balls); // 昇順にソート
        int totalK = 0;
        for (int i = n; i >= n - k + 1; i--) {
            totalK += balls[i];
        }
        System.out.println(n - totalK);
    }
}