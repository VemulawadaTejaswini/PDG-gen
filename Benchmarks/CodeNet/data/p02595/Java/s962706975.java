import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.next();
    int D = sc.next();
    int counts = 0;
    for (int i = 1; i < N + 1; i++) {
      int X_i = new java.util.Scanner(System.in).nextInt();
      int Y_i = new java.util.Scanner(System.in).nextInt();
      double A = Math.sqrt(X_i * X_i + Y_i * Y_i);
      if (A <= D) {
        counts++;
      }
      System.out.println(counts);
    }
  }
}
