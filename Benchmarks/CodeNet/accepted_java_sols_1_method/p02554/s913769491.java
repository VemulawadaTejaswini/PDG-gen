import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buffer.readLine());
        long mod = (int)1e9+7;
        long [] pow10 = new long[n+1];
        long [] pow8 = new long[n+1];
        long [] pow9 = new long[n+1];
        pow8[0] = pow9[0] = pow10[0] = 1;
        for (int pos = 1; pos <= n; pos++) {
            pow8[pos] = (pow8[pos-1]%mod*8)%mod;
            pow9[pos] = (pow9[pos-1]%mod*9)%mod;
            pow10[pos] = (pow10[pos-1]%mod*10)%mod;
        }
        long ans = (pow10[n]%mod - (pow8[n]+(pow9[n]%mod - pow8[n]%mod + mod)*2%mod)%mod + mod)%mod;
        System.out.println(ans);
    }
}
