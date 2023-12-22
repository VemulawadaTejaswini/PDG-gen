import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    for (int i = 0; i < S.length(); i++) {
      if ((S.charAt(i) == 'R' && (i+1) % 2 == 0)
      || (S.charAt(i) == 'L' && (i+1) % 2 != 0)
      ) {
        System.out.println("No");
        return;
      } else {
        continue;
      }
    }
    
    System.out.println("Yes");
  }
}