import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int A = sc.nextInt();
    int cnt = 0;
    double min = Double.MAX_VALUE;
    for (int i = 0; i < N; i++) {
      double B = Math.abs(A - (T - sc.nextInt() * 0.006));
      if (B < min) {
        min = B;
        cnt = i + 1;
      }
    }
    System.out.println(cnt);
  }
}
