import java.io.*;
import java.util.*;
public class Main {
    static long gcd(long a, long b){ return (b==0) ? a : gcd(b, a%b); }
    static int gcd(int a, int b){ return (b==0) ? a : gcd(b, a%b); }
    public static void main(String args[]) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long n = in.nextLong();
        long k = in.nextLong();
        long ans = gcd(n,k);
        System.out.println(find(n,k));
    }
    static long find(long n,long k){
        if(Math.abs(n-k)<n) return find((long)Math.min(n%k,k%n), k);
        return n;
    }
}