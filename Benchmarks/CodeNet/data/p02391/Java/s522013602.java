import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int a = stdin.nextInt();
    int b = stdin.nextInt();
    if (a < b) {
      System.out.println("a < b");
    } else if (a > b) {
      System.out.println("a > b");
    } else {
      System.out.println("a == b");
    }
  }

}