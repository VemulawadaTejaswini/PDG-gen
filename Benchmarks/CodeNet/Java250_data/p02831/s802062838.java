import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final long A = Integer.parseInt(sc.next());
        final long B = Integer.parseInt(sc.next());
        
        out.println(A * B / gcd(A,B));
        
        out.flush();
    }
    
    public static long gcd(long m, long n) {
        long rem;
        while ((rem = m % n) != 0) {
            m = n;
            n = rem;
        }
        return n;
    }
}