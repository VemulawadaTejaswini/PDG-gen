import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    scan.close();

    for(int i=0; i<S.length(); i++) {
      System.out.print('x');
    }
    System.out.println();
  }
}