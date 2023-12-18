import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int count=0,c1=0;
    for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      count=0;
      int x=a[i];
      for(int j=0;j<n;j++)
      {
       if(i!=j)
       {
        if(x%a[j]!=0)
          count=count+1;
        else
            break;
       }
      }
      if(count==n-1)
          c1=c1+1;
  }
    System.out.println(c1);
}
}            