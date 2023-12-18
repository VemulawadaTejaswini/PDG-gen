import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int n = sc.nextInt();
    boolean[] isExist = new boolean[100];
    if (n == 0) {
      sc.nextLine();
      sc.nextLine();
    }
    for (int i = 0; i < n; i++) {
      isExist[sc.nextInt() - 1] = true;
    }

    if (!isExist[x - 1]) {
      System.out.println(x);
      return;
    }

    for (int i = 1; i <= 100; i++) {
      if ((x - 1) - i < 0 || !isExist[(x - 1) - i]) {
        System.out.println(x - i);
        return;
      }

      if ((x - 1) + i >= 100 || !isExist[(x - 1) + i]) {
        System.out.println(x + i);
        return;
      }
    }
  }
}
