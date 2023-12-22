import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();

    int Area = x * y;
    int Length = x + x + y + y;

    System.out.print(Area);
    System.out.print(" ");
    System.out.println(Length);
  }
}
