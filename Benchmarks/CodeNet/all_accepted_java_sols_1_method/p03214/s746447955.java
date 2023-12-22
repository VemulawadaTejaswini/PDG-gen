import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      int[] a = new int[N];
      double ave = 0.0;
      for (int i = 0; i < N; i++) {
        a[i] = sc.nextInt();
        ave += a[i];
      }
      ave /= N;
      int min_frame = 0;
      double r = Integer.MAX_VALUE;
      for (int i = 0; i < N; i++) {
        if (Math.abs((double)a[i] - ave) < r) {
          min_frame = i;
          r = Math.abs((double)a[i] - ave);
        }
      }



      System.out.println(min_frame);
    }
  }
}
