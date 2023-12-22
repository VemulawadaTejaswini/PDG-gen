import java.io.*;

public class Main{
  public static void main(String... args) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String line = stdin.readLine();
    String[] in = line.split(" ");
    int n = Integer.parseInt(in[0]);
    System.err.println(n);
    int k = Integer.parseInt(in[1]);
    System.err.println(k);
    System.out.println(n-k+1);
  }
}