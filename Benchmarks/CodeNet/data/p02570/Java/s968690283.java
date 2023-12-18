// package Contest1#177;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        final long MOD = 1000000007;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long sum = 0, sqSum = 0;

        for(int i=0; i<n; i++){
            int k = Integer.parseInt(st.nextToken());
            sum += (long)k;
            sqSum += (long)(long)(k)*(long)(k);

            sum %= MOD;
            sqSum %= MOD;
        }

        long ans = sum * sum;
        ans -= sqSum;
        ans = (ans%MOD + MOD) %MOD;
        if(ans %  2 == 1) ans+=MOD;
        ans /= 2;
        out.println(ans);
        out.close();
    }
}