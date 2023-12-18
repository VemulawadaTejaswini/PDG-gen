import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int r = scan.nextInt();
    int D = scan.nextInt();
    int x = scan.nextInt();
    for (int i = 0; i < 10; i++) {
      int s = r * x - D;
      System.out.println(r * x - D);
      x = s;
    }
  }
}
