import java.util.*;
public class Main
{
  
  public static void main(String args[]) 
  {
    
    Scanner sc=new Scanner(System.in);
   int len1=sc.nextInt();
   int len2=sc.nextInt();
   long k=sc.nextLong();
   long a1[]=new long[len1];
  long a2[]=new long[len2];
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
        if(t==0 && c1<len1){
          sum=sum+a1[c1];
          c1++;
          t=1;
          if(sum<=k)
            count++;
        }
        else if(t==1 && c2<len2)
        {
            sum=sum+a2[c2];
           c2++;
            t=0;
             if(sum<=k)
            count++;
        }
        else
        {
            if(c2<len2)
            {
                sum=sum+a2[c2];
              
                c2++;
               
               if(sum<=k)
                 count++;
            }
            else if(c1<len1)
            {
                 sum=sum+a1[c1];
               c1++;
                if(sum<=k)
                 count++;
            }
        }
    }
    System.out.println(count);



  }
}