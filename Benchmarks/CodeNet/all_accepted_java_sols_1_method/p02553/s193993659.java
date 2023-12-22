import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    long a1 = a*c;
    long a2 = a*d;
    a1 = Math.max(a1,a2);
    long b1 = b*c;
    long b2 = b*d;
    b1 = Math.max(b1,b2);
    long ans = Math.max(a1,b1);
    System.out.println(ans);
  }
}
