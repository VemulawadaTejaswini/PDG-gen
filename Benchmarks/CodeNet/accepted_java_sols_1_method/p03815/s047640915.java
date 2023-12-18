import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long N = scanner.nextLong();

    long c = N / 11;
    N -= c * 11;
    c *= 2;
    if (N > 0) c += (N - 1) / 6 + 1;
    System.out.println(c);
  }
}
