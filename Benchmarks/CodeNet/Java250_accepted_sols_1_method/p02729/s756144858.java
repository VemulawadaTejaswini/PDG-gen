import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    if (n == 1 && m == 1) {
      System.out.println(0);
      return;
    }

    int nSum = n > 1 ? (n * (n - 1)) / 2 : 0;
    int mSum = m > 1 ? (m * (m - 1)) / 2 : 0;
    System.out.println(nSum + mSum);
  }
}
