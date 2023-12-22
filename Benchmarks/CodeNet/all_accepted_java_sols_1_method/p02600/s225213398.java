import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n < 600) {
      System.out.println(8);
    } else if (n < 800) {
      System.out.println(7);
    } else if (n < 1000) {
      System.out.println(6);
    } else if (n < 1200) {
      System.out.println(5);
    } else if (n < 1400) {
      System.out.println(4);
    } else if (n < 1600) {
      System.out.println(3);
    } else if (n < 1800) {
      System.out.println(2);
    } else if (n < 2000) {
      System.out.println(1);
    }
  }
}