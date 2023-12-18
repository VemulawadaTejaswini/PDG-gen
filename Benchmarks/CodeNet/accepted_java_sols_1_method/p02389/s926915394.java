import java.util.Scanner;

class Main
{
  public static void main(String[] args) {
    int x, y;
    Scanner s = new Scanner(System.in);
    x = s.nextInt();
    y = s.nextInt();
    int perimeter = 2*x + 2*y;
    System.out.println(x*y+" "+perimeter);
  }
}