import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {

  static long gcd(long a, long b) {
    return b == 0 ? a : gcd(b, a%b);
  }

  static long lcm(long t, long ab) {
    return ab / t;
  }

  public static void main(String[] args) throws IOException {
    long a, b, t;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    String str;
    String[] array = new String[2];
    while ((str = buf.readLine()) != null) {
      array = str.split(" ");
      a = Long.parseLong(array[0]);
      b = Long.parseLong(array[1]);
      t = gcd(a, b);
      System.out.println(t + " " + lcm(t, a*b));
    }
  }
}