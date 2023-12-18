import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double r, pi = 3.141592653589;
    r = sc.nextDouble();
    System.out.println(r*r*Math.PI + " " + 2*Math.PI*r);
  }
}