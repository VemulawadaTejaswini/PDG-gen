import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
    String a = String.format("%.5f",r*r*Math.PI);
    String b = String.format("%.5f",2*r*Math.PI);
    System.out.print(a + " ");
    System.out.println(b);
  }
}