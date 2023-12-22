import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long k = sc.nextLong();
    long d = sc.nextLong();
    x = Math.abs(x);
    long a = x/d;
    if(k<=a){
      System.out.println(x-d*k);
      return;
    }
    long b = x%d;
    k -= a;
    if(k%2==0){
      System.out.println(b);
    }else{
      System.out.println(Math.abs(b-d));
    }
  }
}
