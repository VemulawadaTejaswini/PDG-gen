import java.util.Scanner;

public class Main {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String s;
    while (h --> 0) {
      s = sc.next();
      System.out.println(s + "\n" + s);
    }
  }
}
