import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        int[] interval = new int[m - 1];
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        for (int i = 0; i < m - 1; i++) {
            interval[i] = x[i + 1] - x[i];
        }
        Arrays.sort(interval);
        int ans = 0;
        for (int i = 0; i < m - n; i++) {
            ans += interval[i];
        }
        System.out.println(ans);
    }
}
