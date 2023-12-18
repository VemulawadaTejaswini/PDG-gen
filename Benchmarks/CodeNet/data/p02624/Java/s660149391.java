import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = 0;
        for (long i = 1; i <= n; i++) {
            total += 1L * i * (long)Divisors(i);
        }
        System.out.println(total);
    }
    static long Divisors(long n) { 
        long count = 0;
        for (long i = 1;i<=n;i++) {
             if (n%i==0) {
                 count++;
             } 
        }
        return count;    
    } 
}
