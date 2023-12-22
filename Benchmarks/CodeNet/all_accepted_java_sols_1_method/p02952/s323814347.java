import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    if (n >= 10) {
      if (n >= 100) {
        if (n >= 1000) {
          if (n >= 10000) {
            if (n == 100000) {
              System.out.println(90909);
            } else {
              System.out.println(n - 9090);
            }
          } else {
            System.out.println(909);
          }
        } else {
          System.out.println(n - 90);
        }
      } else {
        System.out.println(9);
      }
    } else {
      System.out.println(n);
    }
  }

}