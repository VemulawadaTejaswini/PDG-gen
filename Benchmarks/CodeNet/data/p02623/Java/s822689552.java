import java.util.*;
public class Main
{
  
  public static void main(String args[]) 
  {
    
    Scanner sc=new Scanner(System.in);
   int len1=sc.nextInt();
   int len2=sc.nextInt();
   long k=sc.nextLong();
   long a1[]=new long[len1+len2];
  long a2[]=new long[len2+len1];
   for(int i=0;i<len1;i++)
     a1[i]=sc.nextLong();
    for(int i=0;i<len2;i++)
      a2[i]=sc.nextLong();
    long sum=0;
   long count=0;
    int t=0;
   int c1=0;
   int c2=0;
    while(k>sum && (len1+len2>count))
    {

        if( a1[c1]>a2[c2] ){
          sum=sum+a2[c2];
          c2++;
          }
          else 
          {
            sum=sum+a1[c1];
          c1++;
         }
          if(sum<=k)
            count++;
        
        }
    System.out.println(count);
 
 
 
  }
}