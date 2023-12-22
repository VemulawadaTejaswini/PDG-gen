import java.util.*;

class Main{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   long n = sc.nextLong();
   long a = sc.nextLong();
   long b = sc.nextLong();
   long ret = 0;
   long rep = (long)(n/(a+b));
   ret += rep*a;
   long remain = n - (rep*(a+b));
  
   System.out.println(ret+Math.max(0,Math.min(a,remain)));
}
}