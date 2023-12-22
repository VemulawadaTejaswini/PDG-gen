import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      int M = sc.nextInt();
      int X = sc.nextInt();
      int Y = sc.nextInt();
      int[] Xs = new int[N];
      int[] Ys = new int[M];
      boolean flag = false;
      for (int i = 0; i < N; i++) {
        Xs[i] = sc.nextInt();
      }
      for (int i = 0; i < M; i++) {
        Ys[i] = sc.nextInt();
      }
      out : for (int i = X+1; i <= Y; i++) {
        for (int j = 0; j < N; j++) {
          if (Xs[j] >= i) {
            continue out;
          }
        }
        for (int j = 0; j < M; j++) {
          if (Ys[j] < i) {
            continue out;
          }
        }
        flag = true;
      }
      if (flag) {
        System.out.println("No War");
      } else {
        System.out.println("War");
      }
    }
  }
}
