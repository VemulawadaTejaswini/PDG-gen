import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long H = scanner.nextLong();
    H = H / 2 * 2;
    long count = 1;
    while (H > 1) {
      H /= 2;
      count = count * 2 + 1;
    }
    System.out.println(count);
  }
}
