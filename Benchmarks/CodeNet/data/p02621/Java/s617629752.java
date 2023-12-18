import java.util.*;
class myclass
{
  public static void main(String Args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i,sum=0;
    for(i=1;i<=n;i++)
    {
      sum+=i*sumdiv(i);
    }
    System.out.println(sum);
  }
  static int sumdiv(int a)
  {
    int c=0;
    for(int i=1;i<=a;i++)
    {
      if(a%i==0)
      {
        if(a/i==i)
          c++;
        else
          c+=2;
      }
    }
    return c;
  }
} 