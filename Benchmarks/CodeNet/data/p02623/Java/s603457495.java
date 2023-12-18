
import java.util.*;
public class Main
{
  
  public static void main(String args[]) 
  {
    
    Scanner sc=new Scanner(System.in);
   int len1=sc.nextInt();
   int len2=sc.nextInt();
   long k=sc.nextLong();
   long a1[]=new long[len1+1];
  long a2[]=new long[len2+1];
a1[0]=0;
a2[0]=0;
   for(int i=1;i<=len1;i++)
     a1[i]=sc.nextLong()+a1[i-1];
    for(int i=1;i<=len2;i++)
      a2[i]=sc.nextLong()+a2[i-1];
    int count=0;
   int dec=len2;
   for(int i=0;i<len1 && a1[i]<=k;i++)
{
        while(a1[i]+a2[dec]>=k)
            dec--;
         
        count=Math.max(count,dec+i);
}
System.out.println(count);
 
 
  }
}