import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    
    double log = 0;
    int sum = 0;
    for (int i = 1; i <= N; i++) {
      log = Math.log10(i);
      if (
        log < 1.0 || 
        2.0 <= log && log < 3.0 ||
        4.0 <= log && log < 5.0
      ) {
        sum ++;
      }
    }
    
    System.out.println(sum);
  }
}