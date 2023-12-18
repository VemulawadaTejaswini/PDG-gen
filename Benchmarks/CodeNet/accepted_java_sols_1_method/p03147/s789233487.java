import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] h =new int[N];
   for(int i=0;i<N;i++) h[i] = sc.nextInt();
   
   int tmpmin=h[0];
   int tmpmax;
   boolean up= true;
   int ans =h[0];
   for(int i=1;i<N;i++)
   {
     if(up)
     {
       if(h[i-1]>h[i]) 
       {
         up=false;
         tmpmax=h[i-1];
         ans+=tmpmax-tmpmin;
       }
     }
     else
     {
       if(h[i-1]<h[i])
       {
         up=true;
         tmpmin=h[i-1];
       }
     }
   }
   if(up) ans+= h[N-1]-tmpmin;
   
   System.out.println(ans);
 }
}