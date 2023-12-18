import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x = sc.nextInt();
    int dis = 0;
    int ans = 1;

    while (sc.hasNext()) {
      dis += sc.nextInt();
      if (dis > x) {
        break;
      } else {
        ans++;
      }
    }

    System.out.println(ans);

  }
}