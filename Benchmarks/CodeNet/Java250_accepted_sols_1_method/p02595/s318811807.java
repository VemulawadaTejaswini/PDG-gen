import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long d = (long)sc.nextInt();
    int ans = 0;
    for (int cnt = 0; cnt < n; cnt++) {
      long x = (long)sc.nextInt();
      long y = (long)sc.nextInt();
      if ((x * x) + (y * y) <= (d * d)) {
        ans++;
      }
    }
    System.out.println(ans+"");
    sc.close();
  }
}
