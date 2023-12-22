import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    int Q = Integer.parseInt(sc.next());
    int[] B = new int[N];
    
    for (int i = 0; i < N; i++) {
      B[i] = Q;
    }
    
    for (int i = 0; i < Q; i++) {
      B[Integer.parseInt(sc.next())-1]--;
    }
    
    for (int i = 0; i < N; i++) {
      if (K - B[i] > 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}