import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int T = sc.nextInt();
    if (N % X == 0) {
      System.out.println(N / X * T);
    } else {
      int min = (int)(N / X) + 1;
      System.out.println(min * T);
    }
  }
}
