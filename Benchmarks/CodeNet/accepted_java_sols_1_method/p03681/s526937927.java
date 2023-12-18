import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   long N = sc.nextLong();
   long M = sc.nextLong();
   
   long ans = 1;
   if(Math.abs(N-M)>1) System.out.println(0);
   else
   {
     if(N==M) 
     {
       for(long i=N;i>=1;i--)
       {
         ans*= i;
         ans = ans%1000000007;
       }
       ans = ans*ans;
       ans = ans%1000000007;
       ans *=2 ;
       ans = ans%1000000007;
     }
     else
     {
       if(N+1==M)
       {      
         for(long i=N;i>=1;i--)
         {
           ans*= i;
           ans = ans%1000000007;
         }
         ans = ans*ans;
         ans = ans%1000000007;
         ans *= N+1;
         ans = ans%1000000007;
       }
       else
       {
         for(long i=M;i>=1;i--)
         {
           ans*= i;
           ans = ans%1000000007;
         }
         ans = ans*ans;
         ans = ans%1000000007;
         ans *= M+1;
         ans = ans%1000000007;         
       }
     }
    System.out.println(ans);
   }
 }
}