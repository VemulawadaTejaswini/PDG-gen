import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(sc.next());
    }
    
    int[] ans = new int[N];
    for (int i = 0; i < N; i++) {
      ans[A[i] - 1] = i + 1;
    }
    
    System.out.print(ans[0]);
    for (int i = 1; i < N; i++) {
      System.out.print(" " + ans[i]);
    }
  }
}