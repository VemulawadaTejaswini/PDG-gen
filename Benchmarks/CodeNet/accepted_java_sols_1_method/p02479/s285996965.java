import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    double pi = Math.PI;
    Scanner sca = new Scanner(System.in);
    double r = sca.nextDouble();

    double l,s;

    s = r*r*pi;
    l = 2*r*pi;
 
    System.out.printf("%f %f",s,l);
 
  }
}