import java.util.stream.*;
import java.io.*;

public class Main {

  static int n, k, ans;
  static boolean[] motu;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    k = Integer.parseInt(in[1]);

    motu = new boolean[n];

    for(int i = 0; i < k; i++){
      in = br.readLine().split(" ");
      int d = Integer.parseInt(in[0]);
      in = br.readLine().split(" ");
      int[] a = Stream.of(in).mapToInt(Integer::parseInt).toArray();
      
      for(int j = 0; j < d; j++){
        motu[a[j] - 1] = true;
      }
    }
    
    br.close();

    ans = 0;

    for(int i = 0; i < n; i++){
      if(!motu[i]) ans++;
    }

    PrintWriter out = new PrintWriter(System.out);
    out.println(ans);
    out.flush();

  }
}