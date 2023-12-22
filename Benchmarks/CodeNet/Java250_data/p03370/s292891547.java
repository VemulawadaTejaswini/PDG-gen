
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int[] m = new int[N];

    for (int i = 0; i < N; i++) {
      m[i] = sc.nextInt();
    }
    Arrays.sort(m);
    int sum = (int) Arrays.stream(m).sum();
    int ans = m.length + (X - sum) / m[0];

    System.out.println(ans);
  }
}
