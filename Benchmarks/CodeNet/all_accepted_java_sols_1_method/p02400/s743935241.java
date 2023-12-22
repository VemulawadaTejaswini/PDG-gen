import java.util.*;
  
class Main{
  public static void main(String[] args){
    Scanner stdId = new Scanner(System.in);
    double r = stdId.nextDouble(); 
    double circle;
    System.out.printf("%f %f\n",(r*r*Math.PI),(2*r*Math.PI));
  }
}