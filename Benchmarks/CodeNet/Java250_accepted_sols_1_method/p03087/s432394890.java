import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int Q = scanner.nextInt();
    char[] s = scanner.next().toCharArray();

    int[] sum = new int[N];
    for (int i = 1; i < N; i++) {
      sum[i] = sum[i - 1];
      if (s[i - 1] == 'A' && s[i] == 'C') sum[i]++;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < Q; i++) {
      int l = scanner.nextInt() - 1;
      int r = scanner.nextInt() - 1;
      sb.append(sum[r] - sum[l]).append('\n');
    }
    System.out.println(sb.toString());
  }
}
