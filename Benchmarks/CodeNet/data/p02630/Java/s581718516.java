import java.util.*;
public class Main
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++)
    {a[i]=sc.nextInt();sum+=a[i];}
    int q=sc.nextInt();
   while(q-->0)
   {
     int b=sc.nextInt();
     int c=sc.nextInt();
     for(int i=0;i<n;i++)
     {
       if(a[i]==b)
       {a[i]=c;sum=sum-b+c;}
     }System.out.println(sum);
   }
    
 }
}
