import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int min = 1000000, max = -1000000;
    long sum = 0;

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();

      min = Math.min(a, min);
      max = Math.max(a, max);
      sum += a;
    }
    sc.close();

    System.out.printf("%d %d %d\n", min, max, sum);
  }
}
