import java.util.Scanner;
    
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String aa = scan.next();
    String bb = scan.next();
    String cc = scan.next();
    int a = Integer.parseInt(aa);
    int b = Integer.parseInt(bb);
    int c = Integer.parseInt(cc);
    if (a < b && b < c) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}