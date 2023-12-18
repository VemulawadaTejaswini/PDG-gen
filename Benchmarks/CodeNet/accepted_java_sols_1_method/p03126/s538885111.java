import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] x = new int [m];
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                x[sc.nextInt()-1] += 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++)
            if (x[i] == n)
                ans += 1;

        System.out.println(ans);
    }
}