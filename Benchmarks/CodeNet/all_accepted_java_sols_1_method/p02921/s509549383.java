import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    
    int count = 0;
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == T.charAt(i)) {
        count++;
      }
    }
    
    System.out.println(count);
  }
}