import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[n + 1];
        int ans = 0;
        for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count[i]++;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (count[i] == 8)
                ans++;
        }
        System.out.println(ans);
    }
}