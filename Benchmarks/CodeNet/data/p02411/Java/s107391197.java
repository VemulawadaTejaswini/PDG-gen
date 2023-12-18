import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(true) {
      int m = in.nextInt();
      int f = in.nextInt();
      int r = in.nextInt();

      if (m == -1 && f == -1 && r == -1) {
        break;
      }
      else if (m == -1 || f == -1) {
        System.out.println("F");
      }
      else if (m + f >= 65) {
        if (m + f >= 80) {
          System.out.println("A");
        }
        else {
          System.out.println("B");
        }
      }
      else {
        if (m + f < 50) {
          if (m + f < 30) {
            System.out.println("F");
          }
          else if (m + f >= 30 && r >= 50) {
            System.out.println("C");
          }
          else {
            System.out.println("D");
          }
        }
        else {
          System.out.println("C");
        }
      }
    }
  }
}