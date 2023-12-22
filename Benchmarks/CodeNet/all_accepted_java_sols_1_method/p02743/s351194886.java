import java.io.*;


public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    long a = Long.parseLong(in[0]);
    long b = Long.parseLong(in[1]);
    long c = Long.parseLong(in[2]);

    br.close();

    boolean ok = true;
    if(c <= a + b) ok = false;
    else {
      ok = (4 * a * b < (c - a - b) * (c - a - b));
    }

    System.out.println(ok ? "Yes" : "No");
  }
}