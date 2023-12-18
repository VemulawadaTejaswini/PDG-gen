import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int counts = 0;
    for (int i = 0; i < N; i++) {
      long X = sc.nextLong();
      long Y = sc.nextLong();
      long A = X * X + Y * Y;
      if (A <= D * D) {
        counts++;
      }
    }
    System.out.println(counts);
  }
}
