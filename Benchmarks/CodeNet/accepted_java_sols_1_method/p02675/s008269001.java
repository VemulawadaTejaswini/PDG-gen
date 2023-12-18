import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int n = Integer.parseInt(new Scanner(System.in).nextLine());
    switch (n % 10) {
      case 3:
        System.out.print("bon"); break;
      case 0:
      case 1:
      case 6:
      case 8:
        System.out.print("pon"); break;
      default:
        System.out.print("hon"); break;
    }
  }
}