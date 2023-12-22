import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    long N = in.nextLong();
    long A = in.nextLong();
    long B = in.nextLong();

    long ans1 = (B - A) % 2 == 0 ? (B - A) / 2 : N;
    long ans2 = Math.min(B - 1, N - A);
    long ans3 = Math.min(A - 1, N - B) + 1 + (B - A) / 2;

    System.out.println(Math.min(ans1, Math.min(ans2, ans3)));
  }
}