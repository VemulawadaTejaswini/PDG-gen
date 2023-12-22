import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();

    int rest = a % 1000;
    if (rest == 0) {
      System.out.println(0);
    } else {
      System.out.println(Math.abs((a % 1000) - 1000));
    }
  }
}
