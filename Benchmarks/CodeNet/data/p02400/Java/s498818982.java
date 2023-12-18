import java.util.*;
import java.lang.*;
   
public class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    double r=stdIn.nextDouble();
    double S=Math.PI*r*r, C=Math.PI*2*r;
    System.out.printf("%.6f %.6f",S,C);
  }
}
