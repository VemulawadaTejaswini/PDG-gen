import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int min = 100000;
    for (int i = 0; i < n; i++) {
      int m = sc.nextInt();
      x -= m;
      if (min > m) min = m;
    }
    System.out.println(n + x / min);
  }
}
