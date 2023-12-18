import java.lang.Math.*;
public class Main{
  public static void main(String args[]){
    double a = Integer.parseInt(args[0]);
    double b = Integer.parseInt(args[1]);
    long c = (long)(Math.floor(a*b));
    System.out.print(c);
  }
}
  