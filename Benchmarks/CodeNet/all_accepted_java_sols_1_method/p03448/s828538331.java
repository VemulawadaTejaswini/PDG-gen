import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.nextLine());
    int b = Integer.parseInt(sc.nextLine());
    int c = Integer.parseInt(sc.nextLine());
    int x = Integer.parseInt(sc.nextLine());

    int cnt = 0;
    for (int i = 0; i <= a; i++) {
      for (int ii = 0; ii <= b; ii++) {
        for (int iii = 0; iii <= c; iii++) {
          if (500 * i + 100 * ii + 50 * iii == x) cnt += 1;
        }
      }
    }
    System.out.println(cnt);
  }
}
