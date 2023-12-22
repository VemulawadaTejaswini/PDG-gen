import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] data = br.readLine().split(" ");
    br.close();
    long[] a = new long[n];
    for(int i = 0; i < n; i++){
      a[i] = Long.parseLong(data[i]);
    }
    long ans = 0;
    long sum = 0;
    long mod = 1_000_000_007;
    for(int i = n - 1; i > 0; i--){
      sum += a[i];
      sum %= mod;
      ans += + a[i - 1] * sum;
      ans %= mod;
    }
    System.out.println(ans);
  }
}