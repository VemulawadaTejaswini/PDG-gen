import java.util.*;
class Problem
{
  public static void main(String args[])
  {
    Scanner n=new Scanner (System.in);
    int k=n.nextInt();
    String x="ACL";
    for(int i=1; i<=k;i++)
    {
      x=x+"ACL";
    }
    System.out.println(x);
  }
}