import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    double r = in.nextDouble();
    double pi = Math.PI;
    double menseki = pi * r * r;
    double ensyu = 2 * pi * r;
    
    System.out.printf("%.6f %.6f",menseki,ensyu);
  }
}