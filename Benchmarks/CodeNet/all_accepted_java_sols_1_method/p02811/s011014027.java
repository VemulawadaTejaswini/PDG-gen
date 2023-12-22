import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int K = scan.nextInt();
    int X = scan.nextInt();
    scan.close();

    System.out.println(500*K >= X ? "Yes" : "No");
  }
}