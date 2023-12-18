import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int yen = sc.nextInt();

    int a = yen / 500;

    yen = yen - (500 * a);
    int b = yen / 5;

    System.out.println((a * 1000) + (b * 5));
  }
}