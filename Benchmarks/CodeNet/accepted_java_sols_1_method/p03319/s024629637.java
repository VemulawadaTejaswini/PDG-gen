import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());

    for (int i = 0; i < N; i++) {
      Integer.parseInt(sc.next());
    }

    int ans = (N - 1) / (K - 1);
    if ((N - 1) % (K - 1) != 0) {
      ans++;
    }
    System.out.println(ans);
  }
}