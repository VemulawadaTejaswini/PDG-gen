import java.util.*;
public class Main{
 public static void main(String arg[])
 {
   Scanner sc=new Scanner(System.in);
    
   int n=sc.nextInt();
   int k=sc.nextInt();
   
   int a[]=new int[n];
   
   for(int i=0;i<n;i++)
   {
       a[i]=sc.nextInt();
       
   }
   int s[]=new int[n];
   
   Arrays.fill(s, 1);
   
   for(int i=1;i<n;i++)
   {
       int j=i-1;
       
       while(j>=0)
       {
           if(Math.abs(a[i]-a[j])<=k)
           {
               s[i]=Math.max(s[i],s[j]+1);
           }
           j--;
       }
   }
   int max=0;
   for(int i=0;i<n;i++)max=Math.max(max,s[i]);
     System.out.println(max);
   
 }
}