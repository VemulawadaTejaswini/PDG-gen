import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    String t = scan.next();

    int sLen = s.length();
    int tLen = t.length();
    int min = 1000;

    for (int i = 0; i < tLen; i++) {
      for (int j = 0; j < sLen; j++) {
        if (s.substring(j, j+1).equals(t.substring(i, i+1))) {
          int diff;
          try {
            diff = calculateDiff(s.substring(j-i+1, j+1), t);
          } catch (StringIndexOutOfBoundsException e) {
            break;
          }
          if (min > diff) {
            min = diff;
          }
        }
      }
    }

    PrintWriter out = new PrintWriter(System.out);
    out.println(min);
    out.flush();
  }

  public static int calculateDiff(String a, String b) {
    int count = 0;
    for (int i = 0; i < a.length(); i++) {
      if (!a.substring(i, i+1).equals(b.substring(i, i+1))) {
        count++;
      }
    }
    return count;
  }
}
