import java.util.*;

public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while(scan.hasNext())
       {
      long a,b,a1,b1;
   a=sc.nextInt();
   b=sc.nextInt();
   a1=a;
   b1=b;
   if(b>a)
       {
       long tmp=b;
       b=a;
       a=tmp;
       }
   while(a%b!=0)
       {
       long tmp=b;
       b=a%b;
       a=tmp;
       }
   System.out.println(b+" "+((a1*b1)/b));
       }
   }
}