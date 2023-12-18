import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();

    System.out.print((double) w * h / 2);
    System.out.print(" ");
    int multipleWays = (x == (double) w / 2 && y == (double) h / 2) ? 1 : 0;
    System.out.println(multipleWays);
  }
}