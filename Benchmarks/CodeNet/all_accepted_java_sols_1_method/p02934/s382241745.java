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
    
    double sum = 0;
    for (int i = 0; i < N; i++) {
      sum += (1.0 / A[i]);
    }
    
    System.out.println(1.0/sum);
  }
}