import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int R = scan.nextInt();
    scan.close();

    System.out.println(2*Math.PI*R);
  }
}