import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int h[]=new int[n];
    int b[]=new int[n];
    int c=0;
    for(int i=0;i<n;i++)
    {
      h[i]=sc.nextInt();
     b[i]=0;
    }
    int x,z;
    for(int i=0;i<m;i++)
    {
      x=sc.nextInt();
      z=sc.nextInt();
      b[x-1]=Math.max(b[x-1],h[z-1]);
        b[z-1]=Math.max(b[z-1],h[x-1]);
    }
    
     for(int i=0;i<n;i++)
     {
       if(h[i]>b[i])
       {
        // System.out.println(i+1);
         c++;
       }
         
       
     }
    
    
     System.out.println(c);
    
  }
}