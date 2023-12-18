import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    double b = sc.nextInt();
    double C = sc.nextInt();
    double radian = Math.toRadians(C);
    double sinC = Math.sin(radian);
    double cosC = Math.cos(radian);
    double a2 = Math.pow(a,2);
    double b2 = Math.pow(b,2);
     
    double S = a*b*sinC/2;
    double L = a+b+Math.sqrt(a2+b2-2*a*b*cosC);
    double h = 2*S/a;
    System.out.println(S+" "+L+" "+h);
  }
}
