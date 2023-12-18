import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int d, n, m;
    static int[] shop, dist;
    public static void main(String[] args) {
        while(read()){
            solve();
        }
    }

    static boolean read(){
        d = sc.nextInt();
        if(d == 0) return false;
        n = sc.nextInt();
        m = sc.nextInt();

        shop = new int[n];
        dist = new int[m+1];

        for(int i = 1; i < shop.length; i++){
            shop[i] = sc.nextInt();
            //System.out.println("shop[" + i + "] = " + shop[i]);
        }
        for(int j = 1; j < dist.length; j++){
            dist[j] = sc.nextInt();
            //System.out.println("dist[" + j + "] = " + dist[j]);
        }

        return true;
    }

    static void solve(){
        int res = 0;

        for(int i = 1; i <= m; i++){
            int cost = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++){
                int to = Math.abs(dist[i] - shop[j]);
                cost = Math.min(cost, Math.min(to, d - to));
            }
            //System.out.println("cost = " + cost);
            res += cost;
        }
        System.out.println(res);
    }

}