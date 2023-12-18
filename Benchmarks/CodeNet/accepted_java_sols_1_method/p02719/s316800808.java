import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    long n = Long.parseLong(data[0]);
    long k = Long.parseLong(data[1]);
    
    if (n < k){
      System.out.println(Math.min(n, k-n));
    } else {
      System.out.println(Math.min(n%k, Math.abs(n%k-k)));
    }
  }
}
