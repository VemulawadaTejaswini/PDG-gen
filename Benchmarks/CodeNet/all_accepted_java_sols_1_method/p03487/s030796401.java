import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   
   int[] a = new int[N];
   for(int i=0;i<N;i++) a[i] = sc.nextInt();
   Arrays.sort(a);
   
   int count =1;
   int tmp =0;
   int ans=0;
   for(int i=1;i<N;i++)
   {
     if(a[i]>N) 
     {
       ans+=N-i;
       break;
     }
     else if(a[i]==a[i-1])
     {
       count++;
     }
     else
     {
       if(count<a[i-1])
       {
         ans+=count;
         count=1;
       }
       else if(count>=a[i-1])
       {
         ans+=count-a[i-1];
         count=1;
       }
     }   
   }
   if(count<a[N-1])
       {
         ans+=count;
         count=1;
       }
       else if(count>=a[N-1])
       {
         ans+=count-a[N-1];
         count=1;
       }
   System.out.println(ans);
 }
}