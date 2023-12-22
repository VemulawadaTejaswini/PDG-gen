import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long L = sc.nextInt();
    long R = sc.nextInt();
    int result = 2019;
    int tmp = 0;
    loop: for (; L < R; L++) {
      if (L % 2019 == 0) {
        result = 0;
        break;
      }
      for (long i = L + 1; i <= R; i++) {
        if (i % 2019 == 0) {
          result = 0;
          break loop;
        }
        tmp = (int) ((L * i) % 2019);
        if (tmp < result)
          result = tmp;
      }
    }
    System.out.println(result);
  }
}