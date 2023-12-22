
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String readStr;
    while ((readStr = reader.readLine()) != null) {
      long l = Integer.parseInt(readStr.split(" ")[0]);
      long r = Integer.parseInt(readStr.split(" ")[1]);
      
      System.out.println(gcd(l, r) + " " + lcm(l, r));
    }

  }

  public static long gcd(long m, long n) {
    return n == 0 ? m : gcd(n,m%n);
  }

  public static long lcm(long m, long n) {
    return m*n/gcd(m, n);
  }
  
}