import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static long gcd(long a, long b){
        if(a==b || b==0) return a;
        if(a>b) return gcd(b,a);
        return gcd(b%a, a);
    }

    static boolean solve(long D, long V, long W, long T){
        if(V <= W) return false;
        return D <= T * (V-W);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long V = sc.nextLong();
        long B = sc.nextLong();
        long W = sc.nextLong();
        long T = sc.nextLong();
        
        System.out.println(solve(Math.abs(A-B), V,W, T) ? "YES" : "NO");
        
    }
}
