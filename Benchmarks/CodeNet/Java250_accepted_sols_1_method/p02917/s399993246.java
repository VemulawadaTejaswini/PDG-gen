import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] B = new int[N-1];
    for (int i = 0; i < N-1; i++) {
      B[i] = Integer.parseInt(sc.next());
    }
    
    int sum = B[0];
    for (int i = 1; i < N - 1; i++) {
      if (B[i] > B[i-1]) {
        sum += B[i-1];
      } else {
        sum += B[i];
      }
    }
    sum += B[N-2];
    
    System.out.println(sum);
  }
}