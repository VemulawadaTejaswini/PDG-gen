import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int ac = Math.abs(c-a);
    int ab = Math.abs(b-a);
    int bc = Math.abs(c-b);
    int d = scanner.nextInt();

    if ( ac <= d || (ab <=d && bc<=d) ) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}