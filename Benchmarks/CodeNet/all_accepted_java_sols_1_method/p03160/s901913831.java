import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] h = new long[N];
        for(int n=0; n<N; n++) h[n]=sc.nextLong();

        long[] cost = new long[N];
        cost[0]=0;
        cost[1]=Math.abs(h[0]-h[1]);
        for(int n=2; n<N;n++) cost[n] = Math.min(cost[n-2]+Math.abs(h[n]-h[n-2]), cost[n-1]+Math.abs(h[n]-h[n-1]));

        System.out.println(cost[N-1]);
    }
}
