import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int R = scanner.nextInt();
    int S = scanner.nextInt();
    int P = scanner.nextInt();
    int[] scores = new int[] {R, S, P};
    char[] t = scanner.next().toCharArray();

    long total = 0;
    List<Integer>[] hands = new List[K];
    for (int i = 0; i < K; i++) hands[i] = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      List<Integer> h = hands[i % K];
      switch (t[i]) {
        case 'r':
          h.add(2);
          total += P;
          break;
        case 's':
          h.add(0);
          total += R;
          break;
        case 'p':
          h.add(1);
          total += S;
          break;
      }
    }

    for (List<Integer> h : hands) {
      int prev = -1;
      int count = 0;
      for (int ch : h) {
        if (ch != prev) {
          if (prev >= 0) total -= count / 2 * scores[prev];
          count = 1;
        } else {
          count++;
        }
        prev = ch;
      }
      total -= count / 2 * scores[prev];
    }
    System.out.println(total);
  }
}
