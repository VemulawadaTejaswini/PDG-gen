import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int rem = N % (2 * D + 1);
    int at = N / (2 * D + 1);
    if (rem > 0) {
      at++;
    }
    System.out.println(at);
  }
}
