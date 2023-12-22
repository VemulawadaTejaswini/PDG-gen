import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m, f, r;
    int sum;

     while (true) {
      m = sc.nextInt();
      f = sc.nextInt();
      r = sc.nextInt();
      sum = m + f;

      if (m < 0 && f < 0 && r < 0)
        break;

      if (m < 0 || f < 0) {
        System.out.println("F");
      } else if (sum >= 80) {
        System.out.println("A");
      } else if (sum >= 65 && sum < 80) {
        System.out.println("B");
      } else if (sum >= 50 && sum < 65) {
        System.out.println("C");
      } else if (sum >= 30 && sum < 50) {
        if (r >= 50) {
          System.out.println("C");
        } else {
          System.out.println("D");
        }
      } else if (sum < 30) {
        System.out.println("F");
      }

    }
  }
}