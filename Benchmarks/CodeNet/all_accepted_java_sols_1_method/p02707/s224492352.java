import java.util.stream.*;
import java.io.*;

public class Main {

  static int n;
  static int[] a, ans;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);

    in = br.readLine().split(" ");
    a = Stream.of(in).mapToInt(Integer::parseInt).toArray();

    br.close();

    ans = new int[n];

    for(int i = 0; i < n-1; i++){
      ans[a[i]-1]++;
    }

    for(int i = 0; i < n; i++){
      System.out.println(ans[i]);
    }
    
  }
}