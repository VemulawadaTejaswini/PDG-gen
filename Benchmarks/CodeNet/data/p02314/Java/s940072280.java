import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.*;
//import java.util.stream.IntStream;
import java.nio.charset.Charset;


public class Main {
    static int[][] T;
    static int INFTY = Integer.MAX_VALUE;
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
      //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


     //   try{

            int n = sc.nextInt();
            int m = sc.nextInt();

            // T[i][j] i番目までの効果を使ってj円を作る最小枚数
            T = new int[m + 1][n + 1];
            Arrays.fill(T[0],INFTY);

            int[] c = new int[m + 1];
            for (int i = 1; i < c.length; i++) {
                c[i] = sc.nextInt();
            }

            for (int i = 1; i<=m; i++) {
                // c[i]より小さい部分は前のi-1番目までの数字を使ったものと同じ。nより大きい数字が含まれる場合はnまでで切る
                int end = Math.min(c[i], n + 1);
                for(int j=1;j<end;j++){
                    T[i][j] = T[i-1][j];
                }
                for(int j = c[i];j<=n;j++){
                    T[i][j] = Math.min(T[i-1][j], T[i][j-c[i]] + 1);
                }
            }

            System.out.println(T[m][n]);



    }

}

