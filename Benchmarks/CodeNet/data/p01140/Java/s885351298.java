import java.util.*;

public class Main{

    int n,m;
    int[] h,w;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            if(n==0 && m==0) break;

            h = new int[n];
            w = new int[m];
            int hsum = 0, wsum = 0;
            for(int i=0; i<n; i++){
                h[i] = sc.nextInt();
                hsum += h[i];
            }
            for(int i=0; i<m; i++){
                w[i] = sc.nextInt();
                wsum += w[i];
            }

            int[] hh = new int[hsum+1];
            int[] ww = new int[wsum+1];

            for(int i=0; i<n; i++){
                int sum = 0;
                for(int j=i; j<n; j++){
                    sum += h[j];
                    hh[sum]++;
                }
            }

            for(int i=0; i<m; i++){
                int sum = 0;
                for(int j=i; j<m; j++){
                    sum += w[j];
                    ww[sum]++;
                }
            }

            int ans = 0;
            for(int i=0; i<=Math.min(hsum,wsum); i++){
                ans += hh[i]*ww[i];
            }

            System.out.println(ans);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}