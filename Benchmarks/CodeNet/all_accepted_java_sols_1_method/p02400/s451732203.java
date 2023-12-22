import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
    String area = String.format("%.5f", r*r*Math.PI);
    String length = String.format("%.5f", 2*Math.PI*r);
    System.out.println(area + " " + length);
  }
}