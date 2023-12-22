import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String S = sc.next();
    
    int count = 1;
    for (int i = 0; i < N-1; i++) {
      if (S.charAt(i) != S.charAt(i+1)) {
        count++;
      }
    }
    
    System.out.println(count);
  }
}