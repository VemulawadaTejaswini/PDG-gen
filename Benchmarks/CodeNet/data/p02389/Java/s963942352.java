import java.util.Scanner;

public class Main {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int v = sc.nextInt();
    sc.close();
    int area = h * v;
    int perimeter = 2 * h + 2 * v;

    System.out.println(area + " " + perimeter);
  }
}
