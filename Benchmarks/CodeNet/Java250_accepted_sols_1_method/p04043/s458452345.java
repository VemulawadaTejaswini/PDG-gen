import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[8];
    for(int i=0;i<3;i++)
    {
     int x=sc.nextInt();
      a[x]++;
    }
    if(a[5]==2 && a[7]==1)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
    
  }
}
