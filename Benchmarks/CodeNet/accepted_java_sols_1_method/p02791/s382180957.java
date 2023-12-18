import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] m = new int[n];
        int ans = 0;
        for(int i = 0; i < n; ++i) {
            p[i] = sc.nextInt();
            m[i] = (i == 0) ? p[i] : Math.min(p[i], m[i - 1]);
            if(p[i] == m[i]) ++ans;
        }
        System.out.println(ans);
    }
}