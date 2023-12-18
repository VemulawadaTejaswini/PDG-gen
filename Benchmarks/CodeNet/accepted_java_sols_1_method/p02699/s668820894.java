import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int S = scan.nextInt();
    int W = scan.nextInt();
    scan.close();

    System.out.println(W>=S ? "unsafe" : "safe");
  }
}