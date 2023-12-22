import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();

        long[] A = new long[N];
        long[] B = new long[M];

        for(int n=0; n<N; n++) A[n] = sc.nextLong();
        for(int m=0; m<M; m++) B[m] = sc.nextLong();

        TreeMap<Long, Integer> sumA = new TreeMap<>();
        sumA.put(0L, 0);
        long a = 0;
        for(int n=0; n<N; n++){
            a += A[n];
            sumA.put(a, n+1);
        }

        TreeMap<Long, Integer> sumB = new TreeMap<>();
        sumB.put(0L, 0);
        long b = 0;
        for(int m=0; m<M; m++){
            b += B[m];
            sumB.put(b, m+1);
        }

        int ans = 0;
        for(long s: sumA.keySet()) if(K-s >= 0){
            long t = sumB.floorKey(K-s);
            ans = Math.max(ans, sumA.get(s)+sumB.get(t));
        }

        System.out.println(ans);
    }
}
