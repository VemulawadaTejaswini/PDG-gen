import java.util.Scanner;

/**
 * B - Golden Coins
 */
public class Main {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int val = 0;
    if (N != 0) {
      val = (N / 500) * 1000;
      val += (N % 500) / 5 * 5;
    }

    System.out.println(val);
  }
}