import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long k = sc.nextLong();
    long x = Math.max(0,a-k);
    long y = 0;
    if(x!=0)y=b;
    else y=Math.max(0,b-(k-a));
    System.out.println(x+" "+y);
  }
}
