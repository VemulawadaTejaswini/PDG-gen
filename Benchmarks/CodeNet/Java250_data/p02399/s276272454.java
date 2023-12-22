import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int a = stdin.nextInt();
    int b = stdin.nextInt();
    System.out.printf("%d %d %f", a / b, a % b, (double) a / b);
  }

}