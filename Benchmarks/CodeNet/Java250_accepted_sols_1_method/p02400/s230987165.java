import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
    double a = r*r*Math.PI;
    double b = 2*r*Math.PI;
    System.out.println(String.format("%.5f",a)+" "+String.format("%.5f",b));
  }
}
