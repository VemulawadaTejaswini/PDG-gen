import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int lastA = sc.nextInt();
    long count = 0;
    for (int i = 1; i < n; i++) {
      int a = sc.nextInt();
      if (lastA + a <= x) {
        lastA = a;
        continue;
      }
      count += lastA + a - x;
      lastA = x - lastA;
      if (lastA < 0) {
        lastA = 0;
      }
    }
    sc.close();

    System.out.println(count);
  }
}