import java.util.Scanner;

public class Main{
  public static void main (String[] args){
  double r,S,R;
    Scanner scan =new Scanner(System.in);
    r=scan.nextDouble();
    S=Math.PI*r*r;
    R=Math.PI*r*2;
    System.out.println(String.format("%f %f", S,R));

  }
}

