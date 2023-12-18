import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    double r = in.nextFloat();
    double menseki = Math.PI * r * r;
    double ensyu = 2 * Math.PI * r;
    
    System.out.printf("%.8f %.8f",menseki,ensyu);
  }
}