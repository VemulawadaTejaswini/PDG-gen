
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in[] = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        in = br.readLine().split(" ");
        double arr[]=new double[n];
        double dp[] = new double[n+1];
        for(int i=0;i<n;i++){
            arr[i]=Double.parseDouble(in[i]);
        }
        dp[0]=1;
        for(int i=0;i<n;i++){
            for(int coin=i+1;coin>=0;coin--){
                dp[coin]= ((coin==0)?0:dp[coin-1]*arr[i])+dp[coin]*(1-arr[i]);
            }
        }
        double ans = 0;
        for(int i=0;i<=n;i++){
            int tail = n-i;
            if(tail<i){
                ans+=dp[i];
            }
        }

        System.out.println(ans);
    }
}
