import java.util.Scanner;

public class Main{
  
  public static void main(String[] args) {
    
    Scanner sin = new Scanner(System.in);

    double r = (double)sin.nextInt();
    System.out.printf("%.6f %.6f",r*r*Math.PI,2*Math.PI*r);

    sin.close();
  }
}
