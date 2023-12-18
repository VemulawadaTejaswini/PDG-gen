import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long n = sc.nextLong();
    if(b>n){
      long p =(long)(Math.floor((a*n)/b)-a*Math.floor(n/b));
      System.out.println(p);
    }
    else{
      long x = b-1;
      long p =(long)(Math.floor((a*x)/b)-a*Math.floor(x/b));
      System.out.println(p);
    }
  }
}