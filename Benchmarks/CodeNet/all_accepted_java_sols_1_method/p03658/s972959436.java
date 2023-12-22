import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] l = new int[N];
    for (int i = 0; i < N; i++) {
      l[i] = scanner.nextInt();
    }
    Arrays.sort(l);
    long sum = 0;
    for (int i = 0; i < K; i++) {
      sum += l[N - i - 1];
    }
    System.out.println(sum);
  }
}
