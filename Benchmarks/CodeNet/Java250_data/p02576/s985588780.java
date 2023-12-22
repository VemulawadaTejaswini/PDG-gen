import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max = sc.nextInt();
    int t = sc.nextInt();
    
    double num = (double)n / (double)max;
    num = Math.ceil(num);
    System.out.print((int)num * t);
  }
}