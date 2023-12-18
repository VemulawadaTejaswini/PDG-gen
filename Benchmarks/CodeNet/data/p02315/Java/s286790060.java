import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.*;
//import java.util.stream.IntStream;
import java.nio.charset.Charset;


public class Main {
    static int[][] T;
    static int[][] G;
    static int INFTY = Integer.MAX_VALUE;
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
      //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


     //   try{

            int n = sc.nextInt();
            int w = sc.nextInt();

            // 商品構成を記録するなら二次元配列Gがあったほうが楽？
            T = new int[n+1][w+1];
            G = new int[n+1][w+1];
            Item[] items = new Item[n+1];

            for(int i=1;i<n+1;i++){
                items[i] = new Item();
                items[i].v = sc.nextInt();
                items[i].w = sc.nextInt();
            }
            for(int i=1;i<=n;i++){
                if(items[i].w>w){continue;}

                for (int j = 0; j < items[i].w; j++) {
                    T[i][j] = T[i-1][j];
                }
                for(int j=items[i].w;j<=w;j++){
                    T[i][j] = Math.max(T[i-1][j], T[i-1][j-items[i].w] + items[i].v);
                    // Gに重さjのときの商品構成を記録(逆のほうが出力の時楽じゃない？)。この問題では必要ない。
                    G[i][j] = 1;
                }
            }

            System.out.println(T[n][w]);
    }

}

class Item{
    int v;
    int w;
}
