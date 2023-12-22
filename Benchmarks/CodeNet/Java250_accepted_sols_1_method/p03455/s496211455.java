import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    StringTokenizer st = new StringTokenizer(line);
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    StringBuilder sb = new StringBuilder();
    if (a % 2 == 0 || b % 2 == 0) {
      sb.append(String.format("%s", "Even"));
    } else {
      sb.append(String.format("%s", "Odd"));
    }
    System.out.println(sb.toString());
  }
}
