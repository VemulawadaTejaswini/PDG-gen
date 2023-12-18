import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    int menseki = x * y;
    int syu = (2 * x)+(2 * y);
    System.out.println(menseki + " " + syu);
  }
}