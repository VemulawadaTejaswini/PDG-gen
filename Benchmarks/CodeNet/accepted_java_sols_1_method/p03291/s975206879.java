import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    long N = 1_000_000_007L;
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();

    long[][] d = new long[str.length() + 1][4];
    d[0][0] = 1;
    for (int i = 1; i <= str.length(); i++) {
      char ch = str.charAt(i - 1);

      int m = ch == '?' ? 3 : 1;
      d[i][0] = d[i - 1][0] * m % N;
      d[i][1] = d[i - 1][1] * m % N;
      d[i][2] = d[i - 1][2] * m % N;
      d[i][3] = d[i - 1][3] * m % N;
      switch (ch) {
        case 'A':
          d[i][1] += d[i - 1][0];
          break;
        case 'B':
          d[i][2] += d[i - 1][1];
          break;
        case 'C':
          d[i][3] += d[i - 1][2];
          break;
        case '?':
          d[i][1] += d[i - 1][0];
          d[i][2] += d[i - 1][1];
          d[i][3] += d[i - 1][2];
          break;
        default:
          throw new IllegalArgumentException();
      }

      for (int j = 0; j < 4; j++) {
        d[i][j] %= N;
      }
    }

    System.out.println(d[str.length()][3]);
  }
}
