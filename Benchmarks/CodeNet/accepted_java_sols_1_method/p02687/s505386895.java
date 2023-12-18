import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    scan.close();

    System.out.println(S.equals("ABC") ? "ARC" : "ABC");
  }
}