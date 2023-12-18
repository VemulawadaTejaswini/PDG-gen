import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long a =sc.nextLong();
    long b =sc.nextLong();
    long c =sc.nextLong();
    long d =sc.nextLong();
    long e =a*c;
    long f =b*d;
    long g =a*d;
    long h =b*c;
    long ans =Math.max(e,f);
    ans =Math.max(ans,g);
    ans =Math.max(ans,h);
    System.out.println(ans);
  }
}