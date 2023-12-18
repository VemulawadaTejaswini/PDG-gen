import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();  //動物の数
    int y = sc.nextInt();  //足の総数

    if (y % 2 == 1) {
      System.out.println("No");
      return;
    }

    for (int i = 1; i <= x; i++) {
      if ((2 * i + 4 * (x - i)) == y) {
        System.out.println("Yes");
        return;
      }
    }

    System.out.println("No");
    return;

  }
}
