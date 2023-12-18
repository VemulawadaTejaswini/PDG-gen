import java.util.*;
import java.io.*;

/*
   AtCoder contests
   coder : yoichion
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];
        for(int n=0;n<N;n++){
            h[n] = sc.nextInt();
        }
        Arrays.sort(h);
        int best = 1_000_000_000;
        for(int n=0;n<=N-K;n++){
            best = Math.min(best, h[n+K-1]-h[n]);
        }
        System.out.println(best);
    }
}