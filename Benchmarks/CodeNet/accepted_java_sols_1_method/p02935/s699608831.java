import java.util.*;
class Main
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int z[]=new int[n];
    float c=0.0f;
    for(int i=0;i<n;i++)
    {
      z[i]=sc.nextInt();
    }
    Arrays.sort(z);
    c=z[0];
    for(int i=1;i<n;i++)
    {
      c=(c+z[i])*0.5f;
    }
    System.out.println(c);
  }
}