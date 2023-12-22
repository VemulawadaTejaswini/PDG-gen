import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        ArrayList<Integer> [] adj = new ArrayList[n+1];
        int [] h = new int [n+1];
        for (int i = 1; i <= n; i++) h[i] = sc.nextInt();
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(); int b = sc.nextInt();
            adj[a].add(b); adj[b].add(a);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            boolean good = true;
            for (Integer next: adj[i]) {
                if (h[i] <= h[next]) good = false;
            }
            if (good) ans++;
        }
        System.out.println(ans);
    }


}