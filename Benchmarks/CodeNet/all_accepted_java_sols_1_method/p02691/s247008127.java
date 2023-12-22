import java.util.stream.*;
import java.io.*;

public class Main {

  static int n;
  static long ans;
  static int[] a;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);

    in = br.readLine().split(" ");
    a = Stream.of(in).mapToInt(Integer::parseInt).toArray();

    br.close();

    ans = 0L;

    int[] compToBig = new int[4 * n];

    for(int i = 0; i < n; i++){
      if(a[i] <= n) {
        compToBig[a[i] + i + 2*n]++;
      }
    }

    for(int i = 0; i < n; i++){
      if(a[i] > n) continue;
      ans += compToBig[i - a[i] + 2*n];
    }

    PrintWriter out = new PrintWriter(System.out);
    out.println(ans);
    out.flush();

  }

}