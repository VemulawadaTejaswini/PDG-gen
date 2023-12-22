import java.lang.Math;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double r = sc.nextDouble();

    double area = r*r*Math.PI;
    double length = 2*Math.PI*r;

    System.out.printf("%.6f %.6f",area,length);
    sc.close();
  }
}

