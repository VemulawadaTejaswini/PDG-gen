import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double r= scan.nextDouble();
    double menseki = r * r * 3.14159265358979;
    double ensyu = 2 * r * 3.14159265358979;
    System.out.println(String.format("%.6f", menseki)+ " " + String.format("%.6f", ensyu));
  }
}
