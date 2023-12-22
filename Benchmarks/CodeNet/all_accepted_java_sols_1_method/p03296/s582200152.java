import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    int prev = Integer.parseInt(sc.next());
    ;
    int ans = 0;
    int colorMax = 10000;
    for (int i = 1; i < N; i++) {
      int a = Integer.parseInt(sc.next());
      if (a == prev) {
        ans++;
        prev = colorMax;
        colorMax--;
      } else {
        prev = a;
      }
    }

    System.out.println(ans);
  }
}