import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while (sc.hasNext()) {
      String line = sc.next();
      boolean flag = false;
      for (char c = '0'; c <= '9'; ++c) {
        String temp = line;
        temp = temp.replace('X', c);
        String[] elem = temp.split("[^0-9]");

        boolean ok = true;
        for (int i = 0; i < 3; ++i) {
          if (elem[i].length() > 1 && elem[i].charAt(0) == '0') {
            ok = false;
          }
        }
        if (!ok) continue;

        BigInteger l1 = new BigInteger(elem[0]);
        BigInteger l2 = new BigInteger(elem[1]);
        BigInteger r = new BigInteger(elem[2]);

        l1 = l1.add(l2);
        if (l1.equals(r)) {
          System.out.println(c); flag = true; break;
        }
      }
      if (!flag) {
        System.out.println("NA");
      }
    }
    
  }
}