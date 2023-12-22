import java.util.Scanner;
public class Main {
 public static void main(String[]args){
  final double PI = 3.1416;
  Scanner stdIn = new Scanner(System.in);
  double r = stdIn.nextDouble();//半径
 
  System.out.println(2 * PI * r);
 }
}