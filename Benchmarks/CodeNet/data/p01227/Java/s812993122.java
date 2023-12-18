import java.util.*;

public class Main{

    int n,k;
    int[] x;
    int[] dist;

    void solve(){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int ii=0; ii<t; ii++){
            n = sc.nextInt();
            k = sc.nextInt();
            x = new int[n];
            for(int i=0; i<n; i++) x[i] = sc.nextInt();

            int ans = 0;
            dist = new int[n-1];
            for(int i=0; i<n-1; i++){
                dist[i] = x[i+1]-x[i];
                ans += dist[i];
            }

            Arrays.sort(dist);
            int idx = dist.length-1;
            for(int i=0; i<k-1; i++){
                if(ans==0 || idx-i<0) break;
                ans -= dist[idx-i];
            }

            System.out.println(ans);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}