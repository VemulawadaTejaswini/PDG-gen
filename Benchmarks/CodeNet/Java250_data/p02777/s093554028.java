import java.util.*;

public class Main{
  public static void main(String[]$){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int a=sc.nextInt();
    int b=sc.nextInt();
    String u=sc.next();
    sc.close();
    Solve solve = new Solve(s, t, u, a, b);
  }
}

class Solve{
  public Solve(String s, String t, String u, int a, int b){
    System.out.println(s.equals(u)?--a+" "+b:a+" "+--b);
  }
}
