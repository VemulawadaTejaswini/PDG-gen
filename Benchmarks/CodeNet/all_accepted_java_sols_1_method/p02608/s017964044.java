import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] f = new long[N+1];
        Arrays.fill(f, 0);

        for(long x=1; x<=100; x++) for(long y=1; y<=100; y++) for(long z=1; z<=100; z++){
            long n = x*x + y*y + z*z + x*y + y*z + z*x;
            if(n <= N) f[(int)n]++;
        }
        for(int n=1; n<=N; n++) System.out.println(f[n]);
        
    }
}
