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

        shop = new int[n+1];
        dist = new int[m+1];
        //System.out.println("shop.length = " + shop.length);
        for(int i = 1; i < shop.length-1; i++){
            shop[i] = sc.nextInt();
            //System.out.println("shop["+i+"] = " + shop[i]);
        }
        shop[0] = 0;
        shop[shop.length-1] = d;
        for(int j = 1; j < dist.length; j++){
            dist[j] = sc.nextInt();
            //System.out.println("dist[" + j + "] = " + dist[j]);
        }

        return true;
    }

    static void solve(){
        int res = 0;
        Arrays.sort(shop);
        Arrays.sort(dist);
        for(int i = 1; i < dist.length; i++){
            int index = -1;
            int point = Arrays.binarySearch(shop, dist[i]);
            if(point < 0){
                point = Math.abs(point)-1;
                res += Math.min(Math.abs(shop[point] - dist[i]), Math.abs(shop[point-1] - dist[i]));
            }
            //System.out.println("point = " + point);
        }
        System.out.println(res);
    }
    /*
    static void solve(){
        int res = 0;

        for(int i = 1; i <= m; i++){
            int cost = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++){
                int to = Math.abs(dist[i] - shop[j]);
                cost = Math.min(cost, Math.min(to, d - to));
            }
            res += cost;
        }
        System.out.println(res);
    }
    */
}