import java.util.*;
class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double H = sc.nextDouble();
    double M = sc.nextDouble();
    double thetaH = 2*Math.PI*(H+M/60)/12;
    double thetaM = 2*Math.PI*M/60;
    double theta = Math.abs(thetaH-thetaM);
    double distance = Math.sqrt(A*A + B*B -2*A*B*Math.cos(theta));
    System.out.println(distance);
  }
}