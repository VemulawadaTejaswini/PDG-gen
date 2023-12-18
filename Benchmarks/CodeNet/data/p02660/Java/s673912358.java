
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println(solve(n));
    }

    private static int solve(long n){
        int[] factors = new int[1000001];
        long temp = n;
        for(int prime=2;prime<=1000000;prime++){
            while(temp%prime==0){
                factors[prime]++;
                temp/=prime;
            }
        }
        int count=0;
        for(int i=2;i<=1000000;i++){
            int fac = factors[i];
            for(int j=1;j<=fac;j++){
                fac-=j;
                count++;
            }
        }
        if(temp>1)
            count++;
        return count;
    }


}