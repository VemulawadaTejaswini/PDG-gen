import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    boolean[][] left = new boolean[N][10];
    boolean[][] right = new boolean[N][10];
    for (int i = 1; i < N; i++) for (int j = 0; j < 10; j++) left[i][j] = left[i - 1][j] || S[i - 1] - '0' == j;
    for (int i = N - 2; i >= 0; i--) for (int j = 0; j < 10; j++) right[i][j] = right[i + 1][j] || S[i + 1] - '0' == j;
    boolean[][][] exist = new boolean[10][10][10];
    for (int i = 0; i < N; i++) {
      int k = S[i] - '0';
      for (int j = 0; j < 10; j++) for (int l = 0; l < 10; l++) exist[j][k][l] |= left[i][j] && right[i][l];
    }
    int count = 0;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        for (int k = 0; k < 10; k++) {
          if (exist[i][j][k]) count++;
        }
      }
    }
    System.out.println(count);
  }
}
