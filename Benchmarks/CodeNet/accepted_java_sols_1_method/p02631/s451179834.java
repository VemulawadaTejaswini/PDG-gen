import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int x=0;
    for(int i=0;i<n;i++)
    {
       a[i]=sc.nextInt();
        x=x^a[i];
    }
    
    for(int i=0;i<n;i++)
    {
       int y=a[i]^x;
      System.out.print(y+" ");
    }
  }
}