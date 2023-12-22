import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    final int N = scan.nextInt();
    final int H = scan.nextInt();
    final int W = scan.nextInt();
    System.out.print((N - H + 1) * (N - W + 1));
  }
}
