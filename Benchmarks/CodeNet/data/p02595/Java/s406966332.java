import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int counts = 0;
    for (int i = 0; i < N; i++) {
      int X = new java.util.Scanner(System.in).nextInt();
      int Y = new java.util.Scanner(System.in).nextInt();
      double A = X * X + Y * Y;
      if (A <= D *D) {
        counts++;
      }
    }
    System.out.println(counts);
  }
}
