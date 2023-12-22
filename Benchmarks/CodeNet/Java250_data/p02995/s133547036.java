
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);        
        Long a = stdIn.nextLong();
        Long b = stdIn.nextLong();
        int c = stdIn.nextInt();
        int d = stdIn.nextInt();
        long lcm = LCM(c,d);
        System.out.println((b - a + 1) - ((b/c - (a - 1)/c) +( b/d - (a - 1)/d) - b/lcm + (a - 1)/lcm)); 
    }
    static long LCM(long x, long y){
        if( x < y){
            long t = x;
            x = y;
            y = t;
        }
        return x*y / gcd(x, y);
    }

    private static long gcd(long m, long n){
        if(n == 0) return m;
        else return gcd(n, m % n);
    } 
}