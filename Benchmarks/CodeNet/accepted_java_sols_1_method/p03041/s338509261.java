import java.util.*;
import java.io.*;

public class Main {

  public static void main(String ... args) throws Exception {
    int n = 0, k = 0;
    String s;
    try (BufferedReader isr = new BufferedReader(new InputStreamReader(System.in))) {
      String buf = isr.readLine();
      System.err.println(buf);
      String[] input = buf.split(" ");
      n = Integer.parseInt(input[0]);
      k = Integer.parseInt(input[1]);
      buf = isr.readLine();
      System.err.println(buf);
      s = buf;
    }

    k--;
    StringBuilder sb = new StringBuilder(s);
    sb.setCharAt(k, Character.toLowerCase(sb.charAt(k)));

    System.out.println(sb);
  }

}
