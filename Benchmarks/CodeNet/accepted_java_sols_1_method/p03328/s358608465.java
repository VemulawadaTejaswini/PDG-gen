
import java.util.Scanner;


public class Main {

  public static void main(String [] args) {

    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();

    int n = b - a - 1;

    System.out.println((n * (n + 1) / 2) - a);

  }

}