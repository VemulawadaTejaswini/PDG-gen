import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int Q = sc.nextInt();
   char[] S = sc.next().toCharArray();
   
   int l;
   int r;
   int ans=0;
   int[] forans = new int[N]; 
   for(int i=1;i<N;i++)
     {
       if(S[i-1]=='A'&&S[i]=='C') 
       {
         ans++;
       }
         forans[i]=ans;
     }
   for(int i=0;i<Q;i++)
   {
     l=sc.nextInt();
     r=sc.nextInt();
     ans = forans[r-1] - forans[l-1];       
     System.out.println(ans);
   }
 }
}