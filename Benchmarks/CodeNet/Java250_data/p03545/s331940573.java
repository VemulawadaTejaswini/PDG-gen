import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] d = new int[4];
    int i = 0;
    while (n > 0) {
      d[i] = n % 10;
      i++;
      n /= 10;
    }
    for (int j = -1; j < 2; j += 2) {
      for (int k = -1; k < 2; k += 2) {
        for (int l = -1; l < 2; l += 2) {
          if (d[3] + d[2] * j + d[1] * k + d[0] * l == 7) {
            System.out.printf("%d%c%d%c%d%c%d=7\n", d[3], j < 0 ? '-' : '+', d[2],
                k < 0 ? '-' : '+', d[1], l < 0 ? '-' : '+', d[0]);
            return;
          }
        }
      }
    }
  }
}
