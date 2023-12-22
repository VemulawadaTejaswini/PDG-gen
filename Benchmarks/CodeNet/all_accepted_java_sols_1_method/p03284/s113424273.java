import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();

    System.out.printf("%d\n", N%K==0?0:1);
    scanner.close();
  }
}