import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private Scanner sc;

  private void run() {
    sc = new Scanner(System.in);
    int W = Integer.parseInt(sc.next());
    int H = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());

    double ans = (double) W * (double) H / 2;

    int num = 0;
    if (W == x * 2 && H == y * 2) {
      num = 1;
    }

    System.out.println(ans + " " + num);
  }
}
