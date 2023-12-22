import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    char[] s = scanner.next().toCharArray();

    int max = 0;
    int j = 1;
    int numZeros = 0;
    for (int i = 0; i < N; i++) {
      if (i > 0 && s[i - 1] == '0' && s[i] == '1') numZeros--;
      while (numZeros < K && j < N) {
        if (s[j - 1] == '0' && s[j] == '1') numZeros++;
        j++;
      }
      while (j < N && s[j] == '1') j++;
      max = Math.max(max, j - i);
    }
    System.out.println(max);
  }
}
