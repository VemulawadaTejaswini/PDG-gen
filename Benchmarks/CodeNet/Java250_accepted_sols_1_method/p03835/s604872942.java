
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int S = sc.nextInt();
    int cnt = 0;

    for (int x = 0; x <= K; x++) {
      for (int y = 0; y <= K; y++) {
        int z = S - x - y;
        if (0 <= z && z <= K) cnt++;
      }
    }

    System.out.println(cnt);
  }
}
