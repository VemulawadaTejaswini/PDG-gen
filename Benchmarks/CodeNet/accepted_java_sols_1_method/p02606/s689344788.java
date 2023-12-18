import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int l = sc.nextInt();
    int r = sc.nextInt();
    int d = sc.nextInt();

    int ret = 0;
    int multiply = d;
    while (true) {
      if (multiply > r) {
        break;
      } else if (multiply >= l && multiply <= r) {
        ret++;
      }
      multiply += d;
    }
    System.out.println(ret);
  }
}
