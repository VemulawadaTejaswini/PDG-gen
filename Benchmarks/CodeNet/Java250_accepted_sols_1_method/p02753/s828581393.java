import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    scan.close();

    if(!S.contains("A") || !S.contains("B")) {
      System.out.println("No");
    }
    else {
      System.out.println("Yes");
    }
  }
}