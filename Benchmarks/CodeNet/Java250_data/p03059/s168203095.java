import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double t = sc.nextDouble();
      double time = t+0.5;
      double cou = Math.floor(t/a);
      System.out.println((int)b*(int)cou); 
  }
}

