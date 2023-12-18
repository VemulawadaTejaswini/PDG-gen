import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
    System.out.println(String.format("%.6f", Math.PI*r*r) + " "+ String.format("%.6f",2*Math.PI*r));
  }
}

