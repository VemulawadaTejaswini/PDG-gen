import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt(), X = sc.nextInt();
    int N = 1 + (K - 1) + (K - 1);
    int F = X - K + 1;
    for (int i = 0; i < N; i++) System.out.println(F++);
  }
}