import java.io.*;
import java.util.*;

class Main {
  public static void main(String [] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    for(;;) {
      int n = sc.nextInt();
      if(n == 0) break;
      int [] as = new int[n];
      for(int i = 0; i < n; i++) {
        as[i] = sc.nextInt();
      }
      double ave = 0;
      for(int a : as) { ave += a; }
      ave /= n;
      int c = 0;
      for(int a : as) { if(a <= ave) c++; }
      System.out.println(c);
    }
  }
}

