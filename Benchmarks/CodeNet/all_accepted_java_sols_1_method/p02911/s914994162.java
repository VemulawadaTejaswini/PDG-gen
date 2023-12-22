import java.util.*;
import java.io.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int Q = sc.nextInt();
    int[] A = new int[N];

    for (int i = 0; i < Q; i++) {
      int i_ = sc.nextInt();
      A[i_ - 1]++;
    }

    sc.close();

    PrintWriter out = new PrintWriter(System.out);
    
    for (int i = 0; i < N; i++) {
      if (0 < A[i] + K - Q) {
        out.println("Yes");
      } else {
        out.println("No");
      }
    }

    out.flush();

  }

}