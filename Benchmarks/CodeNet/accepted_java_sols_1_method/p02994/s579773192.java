import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int L = scan.nextInt();

    int sum1 = 0;
    int min = 299;
    int count = 0;
    for (int i = 1; i <= N; i++) {
      int tmp = L + i - 1;
      int tmp2 = tmp;
      if (tmp2 < 0) {
        tmp2 = -1 * tmp2;
      }
      if (tmp2 < min) {
        min = tmp2;
        count = i;
      }
      sum1 += tmp;
    }
    System.out.println(sum1 - (L + count  - 1));
  }
}
