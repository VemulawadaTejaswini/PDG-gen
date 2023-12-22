import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int ans =1;
   for(int i=1;i<9;i++)
   {
     if(ans == N) break; 
     else if(ans>N)
     {

       ans= ans/2;
       break;
     }
     ans*=2;
   }
   System.out.println(ans);
 }
}