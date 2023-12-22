import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    try {
      int N = scanner.nextInt();
      int K = scanner.nextInt();
      int ans = 0;
      for (int i = 0; i < N; i++) {
        int h = scanner.nextInt();
        if (h >= K) ans++;
      }
      System.out.println(ans);
    }
    finally {
      scanner.close();
    }
  }
}