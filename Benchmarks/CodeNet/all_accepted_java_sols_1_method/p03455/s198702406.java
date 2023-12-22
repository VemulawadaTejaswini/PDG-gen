import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    short a = scan.nextShort();
    short b = scan.nextShort();
    int product = a * b;
    if ((product % 2) == 0) {
      System.out.println("Even");
    }else {
      System.out.println("Odd");
    }
  }
}
