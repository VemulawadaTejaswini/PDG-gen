import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   long x=kbd.nextLong();
   long k=kbd.nextLong();
   long d=kbd.nextLong();
   long min=Math.abs(x);
   long z=0;
   if(x>=0){
     if(x>=k*d){
       System.out.println(x-k*d);
     }else{
       long a=x/d;
       long b=x-d*a;
       long c=x-d*(a+1);
       if(Math.abs(b)<=Math.abs(c)){
        min=Math.abs(b);
        z=a;
      }else{
        min=Math.abs(c);
        z=a+1;
      }
      if(Math.abs(min)==d/2||(d-z)/2==0){
        System.out.println(min);
      }else{
        System.out.println(min+d);
      }
    }
  }else{
    x=-x;
    if(x>=k*d){
      System.out.println(x-k*d);
    }else{
      long a=x/d;
      long b=x-d*a;
      long c=x-d*(a+1);
      if(Math.abs(b)<=Math.abs(c)){
       min=Math.abs(b);
       z=a;
     }else{
       min=Math.abs(c);
       z=a+1;
     }
     if(Math.abs(min)==d/2||(d-z)/2==0){
       System.out.println(min);
     }else{
       System.out.println(min+d);
     }
   }
}
}
}