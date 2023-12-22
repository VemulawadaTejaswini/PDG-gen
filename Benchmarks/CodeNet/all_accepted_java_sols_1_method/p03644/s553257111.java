import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int r = 2;
    while (r <= N) {
      r *= 2;
    }
    r /= 2;
    System.out.println(r);
  }
}
