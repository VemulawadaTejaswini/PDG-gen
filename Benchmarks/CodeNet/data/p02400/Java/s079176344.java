import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
    System.out.print(r*r*Math.PI + " ");
    System.out.println(2 * Math.PI * r);
  }
}