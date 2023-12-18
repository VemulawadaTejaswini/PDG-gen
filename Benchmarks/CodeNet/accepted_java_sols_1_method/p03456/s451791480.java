import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String s1 = in.next();
    String s2 = in.next();
    String num = s1 + s2;
    int n = Integer.parseInt(num);
    double sqrt = Math.sqrt(n);
    int x = (int) sqrt;
    if( Math.pow(sqrt,2) == Math.pow(x,2) ) System.out.println("Yes");
    else System.out.println("No");
  }
}