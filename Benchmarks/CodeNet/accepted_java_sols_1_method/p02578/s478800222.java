import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    long max = sc.nextInt();
    long sum = 0;
    for (int i = 1; i < n; i++) {
      long p = sc.nextInt();
      long step;
      if (max > p) {
        step = max - p;
        sum += step;
      } else {
        max = p;
      }
    }
    System.out.println(sum);
  }
}
