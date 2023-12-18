import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int p = 7 % k;
    int np = 0;
    boolean[] b = new boolean[k];
    b[p] = true;
    int cnt = 1;

    if (k == 7) {
      System.out.println(1);
      return;
    }

    while (true) {
      cnt++;
      np = ((p * 10) + 7) % k;
      if (np == 0) {
        System.out.println(cnt);
        return;
      } else if (b[np]) {
        System.out.println(-1);
        return;
      } else {
        b[np] = true;
        p = np;
      }
    }

  }
}