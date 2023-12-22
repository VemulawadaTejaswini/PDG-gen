import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String c = scanner.next();
    int a = c.toCharArray()[0];

    System.out.println((char) (a + 1));
  }


}
