import java.util.*;

public class Main {
    static int MOD = 1000000009;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] c = str.toCharArray();
        
        int originalPopcount = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] == '1') originalPopcount++;
        }
        
        if (originalPopcount == 0) {
            for (int i = 0; i < n; i++) {
                System.out.println(0);
            }
            return;
        }
        
        int plusPopcount = originalPopcount + 1;
        int minusPopcount = originalPopcount - 1;
        
        long[] plusMod = new long[n+1];
        int digit = 1;
        int m = plusPopcount;
        for (int i = n - 1; i >= 0; i--) {
            long num = (c[i] - '0') * digit;
            num %= m;
            
            plusMod[i] = plusMod[i+1] + num;
            plusMod[i] %= m;
            
            digit *= 2;
            digit %= m;
        }
        
        long[] minusMod = new long[n+1];
        digit = 1;
        m = minusPopcount;
        if (m != 0) {
            for (int i = n - 1; i >= 0; i--) {
                long num = (c[i] - '0') * digit;
                num %= m;
                
                minusMod[i] = minusMod[i+1] + num;
                minusMod[i] %= m;
                
                digit *= 2;
                digit %= m;
            }
        }
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            
            int f = 0;
            if (c[i] == '0') {
                f = (int)(plusMod[0] + modpow(2, n-1-i, plusPopcount));
                f %= plusPopcount;
                count++;
            } else {
                if (minusPopcount == 0) {
                    System.out.println(0);
                    continue;
                }
                
                f = (int)(minusMod[0] - modpow(2, n-1-i, minusPopcount));
                f %= minusPopcount;
                count++;
                if (f < 0) {
                    f += minusPopcount;
                }
            }
            // System.out.println(f);
            
            while (f > 0) {
                int popcount = Integer.bitCount(f);
                f %= popcount;
                count++;
            }
            System.out.println(count);
        }
    }
    
    public static long modpow(long num, long n, int mod) {
        // ex. 3^10
        // 3^10 = 3^(0b1010)
        // = 3^8が1個 * 3^4が0個 * 3^2が1個 * 3^1が0個
        // (次の桁の値は(前の桁)^2になる)
        
        long res = 1;
        long digit = num;
        
        while (n > 0) {
            long lsb = n & 1;
            if (lsb == 1) {
                res *= digit;
                res %= mod;
            }
            
            digit = digit * digit;
            digit %= mod;
            n = n >> 1;
        }
        
        return res;
    }
}
