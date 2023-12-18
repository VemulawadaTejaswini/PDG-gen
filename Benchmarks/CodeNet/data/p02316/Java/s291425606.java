import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.*;
//import java.util.stream.IntStream;
import java.nio.charset.Charset;


public class Main {
    static int[] T;
    static int INFTY = Integer.MAX_VALUE;
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
      //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


     //   try{

            int n = sc.nextInt();
            int w = sc.nextInt();

            T = new int[w+1];
            Item[] items = new Item[n+1];

            for(int i=1;i<n+1;i++){
                items[i] = new Item();
                items[i].v = sc.nextInt();
                items[i].w = sc.nextInt();
            }
            for(int i=1;i<=n;i++){
                for(int j=items[i].w;j<=w;j++){
                    T[j] = Math.max(T[j], T[j-items[i].w] + items[i].v);
                }
            }

            System.out.println(T[w]);
    }

}

class Item{
    int v;
    int w;
}
