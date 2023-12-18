import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double r = in.nextDouble();
     
    double square = Math.PI * r * r ;
    double perimeter = Math.PI * 2 * r;
    
    System.out.printf("%5.6f", square);
    System.out.printf(" %5.6f\n", perimeter);
  }
}