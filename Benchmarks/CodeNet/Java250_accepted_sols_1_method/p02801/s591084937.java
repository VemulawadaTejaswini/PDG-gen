import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String C = scan.next();
    scan.close();

    System.out.println((char)(C.charAt(0) + 1));
  }
}