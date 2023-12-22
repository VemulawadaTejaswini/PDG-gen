import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.math.*;
import java.io.*;


public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();

        int[] P = new int[N];
        for(int n=0; n<N; n++) P[n] = sc.nextInt()-1;
        long[] C = new long[N];
        for(int n=0; n<N; n++) C[n] = sc.nextLong();

        int[] loopLength = new int[N];
        long[] loopScore = new long[N];
        for(int n=0; n<N; n++){
            int i=n;
            int k=0;
            long s = 0;
            while(true){
                k++;
                i = P[i];
                s += C[i];
                if(i==n) break;
            }
            while(true){
                i = P[i];
                loopLength[i] = k;
                loopScore[i] = s;
                if(i==n) break;
            }
        }

        //System.out.println(Arrays.toString(loopLength));
        //System.out.println(Arrays.toString(loopScore));

        long ans = C[P[0]];

        for(int n=0; n<N; n++){
            int cur = n;
            long score = 0;
            for(long k=1; k<=K; k++){
                cur = P[cur];
                score += C[cur];
                ans = Math.max(ans, score);

                if(k==loopLength[n] && 5*k<K){
                    k = ((K/loopLength[n]-1))*loopLength[n];
                    cur = n;
                    score = loopScore[n] * (k / loopLength[n]);
                    ans = Math.max(ans, score);
                }
            }
        }

        System.out.println(ans);
        

    }
}
