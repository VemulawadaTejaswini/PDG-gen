import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] v = new int[N];
    for (int i = 0; i < N; i++) v[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) v[i] = v[i] - scanner.nextInt();
    Arrays.sort(v);
    int vmax = 0;
    for (int i = N - 1; i >= 0; i--) {
      if (v[i] > 0) vmax += v[i];
      else break;
    }
    System.out.println(vmax);
  }
}
