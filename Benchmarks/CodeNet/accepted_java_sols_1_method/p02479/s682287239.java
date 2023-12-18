


import java.util.Scanner;
import java.text.DecimalFormat;



public class Main{

  public static void main(String[] args){
    DecimalFormat df1 = new DecimalFormat("0.000000");

    Scanner sc = new Scanner(System.in);

    double r = sc.nextDouble();

    double pi = Math.PI;

    double area = pi*r*r;

    double length = 2*r*pi;

    System.out.println(df1.format(area) + " " + df1.format(length));

  }

}