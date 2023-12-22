import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] numWA = new int[N];
    boolean[] AC = new boolean[N];
    for (int i = 0; i < M; i++) {
      int p = scanner.nextInt() - 1;
      boolean s = scanner.next().equals("AC");
      if (s) {
        AC[p] = true;
      } else if (!AC[p]) {
        numWA[p]++;
      }
    }

    int numAC = 0;
    int penalty = 0;
    for (int i = 0; i < N; i++) if (AC[i]) numAC++;
    for (int i = 0; i < N; i++) if (AC[i]) penalty += numWA[i];
    System.out.printf("%d %d\n", numAC, penalty);
  }
}
