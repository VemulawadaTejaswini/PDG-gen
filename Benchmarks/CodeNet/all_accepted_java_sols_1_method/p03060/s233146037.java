import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        int[] c = new int[n];
        for (int i = 0;i<n;i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 0;i<n;i++) {
            c[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0;i<n;i++) {
            int tmp = v[i] - c[i];
            if (tmp > 0) ans += tmp;
        }
        System.out.println(ans);
    }
}