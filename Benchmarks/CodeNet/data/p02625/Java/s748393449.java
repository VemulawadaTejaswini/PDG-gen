import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    static public void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long x1 = 0, y1 = 0, x2 = sc.nextLong() + 1, y2 = sc.nextLong() + 1;
        BigInteger ans = f(x2, y2);
        ans = ans.subtract(f(x1 - 1, y2));
        ans = ans.subtract(f(x2, y1 - 1));
        ans = ans.add(f(x1 - 1, y1 - 1));
        Long = ans.longValue();
        Long mo = 1000000007;
        while (ans >= mo)
              ans -= mo;
        System.out.println(ans);
    }
    static BigInteger f(long x, long y){
        long p = 1;
        for(int i = 0; i < 60; i ++)
            p *= 2L;
        BigInteger P = new BigInteger(p + "");
        BigInteger ans = new BigInteger("0");
        while(x > 0 && y > 0){
            if(y < x){
                long buf = x;
                x = y;
                y = buf;
            }
            if(y < p){
                P  = P.divide(new BigInteger("2"));
                p /= 2L;
                continue;
            }
            if(x < p) {
                BigInteger now = new BigInteger("" + x);
                now = now.multiply(P);
                long XX = y+y-p-1;
                now = now.multiply(new BigInteger(XX + ""));
                now = now.divide(new BigInteger("2"));
                ans = ans.add(now);
            }
            else{
                long g = x + y - p;
                BigInteger now = new BigInteger("" + g);
                now = now.multiply(P);
                long p3 = 3L * p - 1L;
                now = now.multiply(new BigInteger("" + p3));
                now = now.divide(new BigInteger("2"));
                BigInteger cur = P;
                cur = cur.multiply(P);
                cur = cur.multiply(P);
                now = now.subtract(cur);
                ans = ans.add(now);
                x -= p;
            }
            y -= p;
        }
        return ans;
    }
}