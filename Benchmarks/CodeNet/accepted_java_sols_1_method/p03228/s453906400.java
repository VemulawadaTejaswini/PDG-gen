import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();

    for (int i = 0; i < (k / 2); i++) {
      a /= 2;
      b += a;
      b /= 2;
      a += b;
    }

    if ((k % 2) == 1) {
      a /= 2;
      b += a;
    }

    System.out.println(a + " " + b);

  }
}