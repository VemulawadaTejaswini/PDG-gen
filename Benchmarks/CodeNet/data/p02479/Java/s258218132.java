import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double r = input.nextDouble();
    double pi = Math.PI;
    double area = pi * Math.pow(r,2);
    double length = 2 * pi * r;
    System.out.printf("%f %f",area, length);
  }
}