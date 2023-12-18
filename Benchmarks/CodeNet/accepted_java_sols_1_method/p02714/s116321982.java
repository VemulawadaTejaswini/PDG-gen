import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    long[] lr = new long[N], lg = new long[N], lb = new long[N];
    for (int i = 1; i < N; i++) {
      lr[i] = lr[i - 1];
      lg[i] = lg[i - 1];
      lb[i] = lb[i - 1];
      if (S[i - 1] == 'R') lr[i]++;
      if (S[i - 1] == 'G') lg[i]++;
      if (S[i - 1] == 'B') lb[i]++;
    }
    long[] rr = new long[N], rg = new long[N], rb = new long[N];
    for (int i = N - 2; i >= 0; i--) {
      rr[i] = rr[i + 1];
      rg[i] = rg[i + 1];
      rb[i] = rb[i + 1];
      if (S[i + 1] == 'R') rr[i]++;
      if (S[i + 1] == 'G') rg[i]++;
      if (S[i + 1] == 'B') rb[i]++;
    }
    long count = 0;
    for (int i = 0; i < N; i++) {
      switch (S[i]) {
        case 'R':
          count += lg[i] * rb[i] + lb[i] * rg[i];
          for (int j = 0; i - j >= 0 && i + j < N; j++) {
            if (S[i - j] == 'G' && S[i + j] == 'B') count--;
            if (S[i - j] == 'B' && S[i + j] == 'G') count--;
          }
          break;
        case 'G':
          count += lr[i] * rb[i] + lb[i] * rr[i];
          for (int j = 0; i - j >= 0 && i + j < N; j++) {
            if (S[i - j] == 'R' && S[i + j] == 'B') count--;
            if (S[i - j] == 'B' && S[i + j] == 'R') count--;
          }
          break;
        case 'B':
          count += lr[i] * rg[i] + lg[i] * rr[i];
          for (int j = 0; i - j >= 0 && i + j < N; j++) {
            if (S[i - j] == 'R' && S[i + j] == 'G') count--;
            if (S[i - j] == 'G' && S[i + j] == 'R') count--;
          }
          break;
      }
    }
    System.out.println(count);
  }
}
