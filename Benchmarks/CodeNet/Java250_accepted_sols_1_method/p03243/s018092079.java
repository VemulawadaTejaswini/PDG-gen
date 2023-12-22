import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int t = N / 100;
    if (N > t * 111) {
      System.out.println((t + 1) * 111);
    } else {
      System.out.println(t * 111);
    }
  }
}
