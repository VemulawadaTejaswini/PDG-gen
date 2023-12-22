import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    long a = Integer.parseInt(scan.next());
    long b = Integer.parseInt(scan.next());
    long c = Integer.parseInt(scan.next());
    long d = Integer.parseInt(scan.next());

    long[] respondents = new long[4];
    respondents[0] = a * c;
    respondents[1] = a * d;
    respondents[2] = b * c;
    respondents[3] = b * d;
    long max = respondents[0];
    for (int i = 1; i < respondents.length; i++) {
      max = Math.max(max, respondents[i]);
    }
    out.println(max);
    out.flush();
  }
}
