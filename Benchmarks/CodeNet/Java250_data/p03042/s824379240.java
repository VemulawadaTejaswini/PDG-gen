import java.util.*;
import java.io.*;

public class Main {
  static String[] result = new String[] {
    "YYMM", "MMYY", "AMBIGUOUS", "NA" 
  };
  
  static int type(int s) {
    if (0 <= s && s <= 99) {
      if (1 <= s && s <= 12) {
        return 1; // M
      }
      return 0; // Y
    }
    throw new RuntimeException();
  }

  public static void main(String ... args) throws Exception {
    int n = 0, k = 0;
    String s;
    try (BufferedReader isr = new BufferedReader(new InputStreamReader(System.in))) {
      String buf = isr.readLine();
      System.err.println(buf);
      /*
      String[] input = buf.split(" ");
      n = Integer.parseInt(input[0]);
      k = Integer.parseInt(input[1]);
      buf = isr.readLine();
      System.err.println(buf);
      */
      s = buf;
    }

    String s1 = s.substring(0,2);
    String s2 = s.substring(2,4);
    int l = type(Integer.parseInt(s1));
    int r = type(Integer.parseInt(s2));
    System.err.println(l);
    System.err.println(r);

    int res = 0;
    if ((l & r) == 1) {
      res = 2;
    } 
    if ((l | r) == 0) {
      res = 3;
    }
    if ((l ^ r) == 1) {
      if (l == 1) {
        res = 1;
      } else {
        res = 0;
      }
    }
    System.out.println(result[res]);
  }

}
