import java.util.*;

public class Main {
    public static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Scan.nextInt();
        int k = Scan.nextInt();

        int p[] = new int[n+1];
        long c[] = new long[n+1];
        for(int i=1; i<=n; i++) p[i] = Scan.nextInt();
        for(int i=1; i<=n; i++) c[i] = Scan.nextLong();

        boolean vis[] = new boolean[n+1];

        long ans = (long)-1e18;
        for(int i=1; i<=n; i++) {
            long now = 0;
            Arrays.fill(vis, false);
            int nxt = p[i];

            int z = k, cnt = 0;
            while(vis[nxt] == false && z != 0) {
                now += c[nxt];
                vis[nxt] = true;
                nxt = p[nxt]; z--; cnt++;
                ans = Math.max(ans, now);
            }
            now += now * (z / cnt);
            z %= cnt;
            while(z != 0) {
                now += c[nxt];
                vis[nxt] = true;
                nxt = p[nxt]; z--;
                ans = Math.max(ans, now);
            }

        }


        System.out.println(ans);
    }
}