import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int ret = 0;
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if ((i + 1) % 2 != 0 && a % 2 != 0) {
        ret++;
      }
    }
    System.out.println(ret);
  }
}