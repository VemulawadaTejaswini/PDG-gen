import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int lim = 400;
    int ans = 8;
    while (true) {
      if ((lim <= x) && (x < (lim + 200))) {
        System.out.println(ans);
        return;
      } else {
        lim += 200;
        ans--;
      }
    }

  }
}