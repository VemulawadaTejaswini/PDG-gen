import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String S = sc.next();
    
    if (N % 2 != 0) {
      System.out.println("No");
      return;
    }
    
    String T = S.substring(0, N/2);
    String TT = T+T;

    if (TT.equals(S)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}