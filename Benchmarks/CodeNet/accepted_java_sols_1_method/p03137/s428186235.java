import java.util.*;
import java.io.*;

/*
   AtCoder contest
   coder : yoichidon
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] X = new int[M];
        for(int m=0; m<M; m++) X[m]=sc.nextInt();
        Arrays.sort(X);
        int[] dX = new int[M-1];
        for(int m=0; m<M-1; m++) dX[m] = X[m+1]-X[m];
        Arrays.sort(dX);
        long ans = 0;
        for(int i=0; i<M-N; i++) ans += dX[i];
        System.out.println(ans);

    }
}
