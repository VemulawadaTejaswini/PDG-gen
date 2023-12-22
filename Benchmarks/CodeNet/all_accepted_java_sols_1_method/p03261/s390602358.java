import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      String pre = sc.next();
      HashSet<String> hs = new HashSet<String>();
      hs.add(pre);
      for (int i = 0; i < N-1; i++) {
        String now = sc.next();
        if (now.charAt(0) == pre.charAt(pre.length()-1) && !hs.contains(now)) {
          hs.add(now);
          pre = now;
        } else {
          System.out.println("No");
          return;
        }
      }
      System.out.println("Yes");
    }
  }
}
