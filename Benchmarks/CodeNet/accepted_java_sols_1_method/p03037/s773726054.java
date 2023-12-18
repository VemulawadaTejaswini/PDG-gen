import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int nl = sc.nextInt();
    int nr = sc.nextInt();

    for (int i = 1; i < m; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      nl = Math.max(nl, l);
      nr = Math.min(nr, r);
    }

    System.out.println(Math.max((nr - nl) + 1, 0));

  }
}