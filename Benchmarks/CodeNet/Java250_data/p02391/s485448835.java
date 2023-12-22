import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String aa = scan.next();
    String bb = scan.next();
    int a = Integer.parseInt(aa);
    int b = Integer.parseInt(bb);
    if (a > b) {
      System.out.println("a > b");
    } else if (a < b) {
      System.out.println("a < b");
    } else if (a == b) {
      System.out.println("a == b");
    } else {
    }
  }
}