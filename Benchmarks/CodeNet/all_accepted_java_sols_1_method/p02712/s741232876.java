import java.io.*;

public class Main {

  static long n, ans;

  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    n = Long.parseLong(in[0]);

    br.close();

    ans = 0L;

    for(long i = 1; i <= n; i++){
      if(i % 3 != 0 && i % 5 != 0) ans += i;
    }

    System.out.println(ans);

  }
}