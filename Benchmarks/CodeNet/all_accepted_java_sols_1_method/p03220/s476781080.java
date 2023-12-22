import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int t = sc.nextInt();
    int a = sc.nextInt();
    int ans = 0;
    double mingap = Double.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      int h = sc.nextInt();
      double gap = Math.abs(t - (h * 0.006) - a);
      if (gap < mingap) {
        mingap = gap;
        ans = i + 1;
      }
    }

    System.out.println(ans);

  }
}