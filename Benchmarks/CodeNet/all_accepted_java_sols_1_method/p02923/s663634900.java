import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 1;
        int cur = 1;
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        for(int i = 1; i < n; i++) {
            if(h[i] <= h[i - 1]) {
                ++cur;
                ans = Math.max(cur, ans);
            } else {
                cur = 1;
            }
        }
        System.out.println(ans - 1);

    }
}