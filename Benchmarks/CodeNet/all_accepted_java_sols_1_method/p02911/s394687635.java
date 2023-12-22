import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 参加者数
        int[] points = new int[n];
        int k = sc.nextInt(); // 初期ポイント
        int q = sc.nextInt(); // 問題数
        for (int i = 0; i < q; i++) {
            int ok_i = (sc.nextInt() - 1); // 正解者ID
            points[ok_i]++;
        }
        // 通過check
        for (int i = 0; i < n; i++) {
            if (q - points[i] >= k) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}