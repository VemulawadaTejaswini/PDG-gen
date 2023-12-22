import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int k = scan.nextInt();
    int x = scan.nextInt();

    System.out.println((x <= 500 * k ? "Yes" : "No"));

    scan.close();
  }
}