import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    
    double r = stdIn.nextDouble();
    
    double L = 2 * r * Math.PI;
    
      System.out.print(L);
  }
}