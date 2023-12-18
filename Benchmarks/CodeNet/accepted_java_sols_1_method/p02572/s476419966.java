import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    long[] a = new long[n];
    String[] data = br.readLine().split(" ");
    br.close();
    for(int i = 0; i < n; i++){
      a[i] = Long.parseLong(data[i]);
    }
    long answer = 0;
    long sum = 0;
    long mod = 1_000_000_007;
    for(int idx = n - 1; idx > 0; idx--){
      sum = sum + a[idx];
      sum %= mod;
      long temp = sum * a[idx - 1] % mod;
      answer += temp;
      answer %= mod;
    }
    System.out.println(answer);
  }
}