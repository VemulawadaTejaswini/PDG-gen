import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   long N = sc.nextLong();
   double Nroot = Math.sqrt(N);
   int Nrint = (int) Nroot;
   long tmp =N;
   for(int i =Nrint;i>=1;i--)
   {
     if(N%i==0) 
     {
       tmp = (long)N/i; 
       break;
     }
   }
   int ans =1;
   while(tmp>=10)
   {
     tmp/=10;
     ans++;
   }
   System.out.println(ans);
 }
}