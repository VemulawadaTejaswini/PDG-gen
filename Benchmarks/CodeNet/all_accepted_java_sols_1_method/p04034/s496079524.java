import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        boolean [] ok = new boolean[n+1]; ok[1] = true;
        int [] ct = new int[n+1];
        Arrays.fill(ct, 1);
        for (int i = 0; i < m; i++) {
            int from = sc.nextInt(); int to = sc.nextInt();
            ct[from]--; ct[to]++;
            if (ok[from]) ok[to] = true;
            if (ct[from] == 0) ok[from] = false;
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) if (ok[i]) ans++;
        System.out.println(ans);
    }


}