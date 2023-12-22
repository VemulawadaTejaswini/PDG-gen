import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long X = scanner.nextLong();
    long a = 100;
    int t = 0;
    while (a < X) {
      a += a / 100;
      t++;
    }
    System.out.println(t);
  }
}
