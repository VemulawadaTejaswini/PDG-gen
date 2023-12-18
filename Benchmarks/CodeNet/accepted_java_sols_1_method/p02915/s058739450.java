import java.io.*;
import java.util.*;

public class Main {
  public static void main(String... args) {
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));

    try {
      int n = Integer.parseInt(br.readLine());
      System.out.println((int)Math.pow(n, 3));
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}