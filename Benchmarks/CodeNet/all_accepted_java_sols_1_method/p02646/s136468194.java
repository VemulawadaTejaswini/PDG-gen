import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      long  a=sc.nextLong();
      long v=sc.nextLong();
      long b=sc.nextLong();
      long w=sc.nextLong();
      long t=sc.nextLong();
      long p=Math.abs(a-b);
      long q=t*(v-w);
     
      
      if(p<=q)
      System.out.println("YES");
      else
      System.out.println("NO");
      }
    
}