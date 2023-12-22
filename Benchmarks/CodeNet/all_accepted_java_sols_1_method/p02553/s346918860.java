import java.util.*;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    
    long h = a*c;
    long i = a*d;
    long j = b*c;
    long k = b*d;
    
    long x = Math.max(h,i);
    long y = Math.max(j,k);
    long z = Math.max(x,y);
    
    System.out.println(z);
  }
}
    
    
    