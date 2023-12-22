import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int w = scan.nextInt();
    int h = scan.nextInt();
    int x = scan.nextInt();
    int y = scan.nextInt();
    int r = scan.nextInt();
    boolean yoko;
    boolean tate;
    if (x-r >= 0 && x+r <= w) {
      yoko = true;
    } else {
      yoko = false;
    }

    if (y-r >= 0 && y+r <= h) {
      tate = true;
    } else {
      tate = false;
    }
    if (yoko == true && tate == true) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}