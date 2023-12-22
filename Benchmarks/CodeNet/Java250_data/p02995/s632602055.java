import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        long A = Long.parseLong(s[0]);
        long B = Long.parseLong(s[1]);
        long C = Long.parseLong(s[2]);
        long D = Long.parseLong(s[3]);
        System.out.println((B - A + 1) - divider(A, B, C) - divider(A, B, D) + divider(A, B, lcm(C,D)));
    }
    
    public static long divider(long A, long B,long div) {
        long start = 0;
        long end = 0;
        if(A <= div) {
            start = div;
        }else {
            if(A % div == 0) {
                start = A;
            }else {
                start = A + div - A % div;
            }
        }
        
        if(B < div) {
          return 0;
        }else {
            end = B - B % div;
        }
        if(start > end)return 0;
        return (end - start) / div + 1;
    }
    
    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
    
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}
