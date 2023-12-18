import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double r = scan.nextDouble();
    System.out.printf("%f %f",r*r*Math.PI,2*r*Math.PI);
    scan.close();
  }
}
