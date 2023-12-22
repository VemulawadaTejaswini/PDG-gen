import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
  
        long n;
        long m;

         n = sc.nextLong();
      m = sc.nextLong();
       
      if(m>n){
        long k= Math.abs(m-n);
        if(k>=n){
          System.out.println(n);
        }
        else{
          System.out.println(k);
        }
      }else if(m==n){
         System.out.println(0);
      } else {
    	  if(m==0) {
    		  System.out.println(n);
    	  }else {
        long l = n/m;
        long rem = n%m;
        long x = Math.abs(rem-m);
         if(x>=rem){
          System.out.println(rem);
        }
        else{
          System.out.println(x);
        }
    	  }
      }
          
          
          
       
       
        
  }
}
        
