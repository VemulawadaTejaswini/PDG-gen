import java.util.Scanner;
public class Main{

 public static void main(String[]args){
  final double PI = 3.1415927;
  Scanner stdIn = new Scanner(System.in);
  double r = stdIn.nextDouble();

  System.out.println( 2 * PI * r);
  System.out.println( PI * r * r);

 	}
}
