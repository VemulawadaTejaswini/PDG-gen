
    import java.util.Arrays;
    import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long n = scanner.nextLong();

    if(b <= n) {
      System.out.println(a * (b-1) / b);
    } else {
      System.out.println(a * n / b);
    }
  }
}
