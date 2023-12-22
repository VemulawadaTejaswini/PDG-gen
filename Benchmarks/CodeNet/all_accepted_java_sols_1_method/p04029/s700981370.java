import java.io.*;
import java.util.*;

public class Main {
  static int MOD = 1000000007;
  static double EPS = 1e-9;

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(in.readLine());

    System.out.println(N * (N + 1) / 2);

    in.close();
  }
}