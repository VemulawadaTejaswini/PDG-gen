import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    if (n % 2 == 0 && n > 1) {
      int nn = n / 2;
      if (s.substring(0, nn).equals(s.substring(nn, n))) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    } else {
      System.out.println("No");
    }
  }
}