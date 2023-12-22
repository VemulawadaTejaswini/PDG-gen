import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.io.PrintWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    in.close();
    
    BigInteger ba = BigInteger.valueOf(a);
    BigInteger bb = BigInteger.valueOf(b);
    BigInteger gcd = ba.gcd(bb);
    PrintWriter pw = new PrintWriter(System.out);
    pw.println(ba.multiply(bb).divide(gcd).toString());
    pw.flush();
  }
}