import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    
    if (N % 2 == 0) {
      System.out.printf("%.6f\n", 0.5);
    } else {
      System.out.printf("%.6f\n", (N + 1) / (2.0 * N));
    }
  }
}