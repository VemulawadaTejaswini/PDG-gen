import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] m = new int[n];
        int ans = n;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            m[i] = p;
            x -= p;
            min = Math.min(min, p);
        }
        ans += x / min;
        System.out.println(ans);
    }
}
