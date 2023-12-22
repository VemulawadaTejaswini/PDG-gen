import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double calc1 = Math.pow(a,2);
    double calc2 = Math.pow(a,3);
    
    System.out.println((int)a + (int)calc1 + (int)calc2);
  }
}