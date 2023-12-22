import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long K = sc.nextLong();
    sc.close();

    long q = N / K; // 0方向に丸め込む
    long ans = Math.min(Math.abs(N - (K * (q + 1))), Math.abs(N - (K * q)));
    System.out.println(ans);
  }
}
