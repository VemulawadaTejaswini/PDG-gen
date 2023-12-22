import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   int N = sc.nextInt();
   char[] as = sc.next().toCharArray();
   
   int[] Esum = new int[N];
   int E =0;
   for(int i=0;i<N;i++) 
   {
     if(as[i]=='E') E++;
     Esum[i]=E;
   }
   int W = N - E;
   
   int ans= E;
   int tmpE=0;
   int tmpW=0;
   for(int i=1;i<N;i++)
   {
     tmpE=Esum[i-1];
     tmpW=i-tmpE;
     
     if(ans>E-Esum[i]+tmpW) ans = E-Esum[i] + tmpW;
   }
   System.out.println(ans);
 }
}