import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    byte a = scan.nextByte();
    byte b = scan.nextByte();
    byte c = scan.nextByte();
    if ((b - a) == (c - b)) {
      System.out.println("YES");
    }else {
      System.out.println("NO");
    }
  }
}
