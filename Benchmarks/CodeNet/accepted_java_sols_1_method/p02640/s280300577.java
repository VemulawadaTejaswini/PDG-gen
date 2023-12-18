import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();

    for (int i = 0; i <= x; i++) {
      int turu = i;
      int kame = x - i;
      if (2 * turu + 4 * kame == y) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");

  }

}