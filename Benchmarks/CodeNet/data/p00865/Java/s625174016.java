import java.util.*;

class Main{

    int n,m,k;
    int[] sum;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            if(n==0 && m==0 && k==0) break;

            sum = new int[n*m-k+1];

            getsum(0,0);

            double ans = 0.0;
            for(int i=0; i<sum.length; i++){
                ans += (double)sum[i]/Math.pow(m,n)*i;
            }

            System.out.println(ans);
        }
    }

    void getsum(int pos, int s){
        if(pos==n){
            int num = Math.max(s-k,1);
            sum[num]++;
            return;
        }

        for(int i=1; i<=m; i++){
            getsum(pos+1,s+i);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}