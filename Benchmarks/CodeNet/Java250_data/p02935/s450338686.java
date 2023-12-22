import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    double arr[]=new double[n];
   
    
    double av=0;
    for (int i=0;i<n;i++)
      arr[i]=sc.nextDouble();
    Arrays.sort(arr);
    for (int i=0;i<n-1;i++)
    {
      av=(arr[i]+arr[i+1])/(double)2;
      arr[i+1]=av;
    }
      System.out.println(av);
  }
}