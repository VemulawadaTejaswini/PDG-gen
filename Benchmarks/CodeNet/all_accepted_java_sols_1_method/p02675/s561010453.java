import java.util.*;

public class Main {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();

    n = n % 10;
    if (n == 2 || n == 4 || n == 5 || n == 7 || n == 9) {
      System.out.println("hon");
    }
    if (n == 0 || n == 1 || n == 6 || n == 8) {
      System.out.println("pon");
    }
    if (n == 3) {
      System.out.println("bon");
    }
  }
}