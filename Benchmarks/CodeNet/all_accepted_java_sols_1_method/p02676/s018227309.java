import java.lang.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    String s;int k;
    Scanner sc=new Scanner(System.in);
    k=sc.nextInt();
    s=sc.next();
    String s1[]=s.split("");
    if(s1.length<=k)
    {
     System.out.println(s);
    }
    else
    {
      for(int i=0;i<k;i++)
      {
        System.out.print(s1[i]+"");
      }
      System.out.println("...");
    }
  }
}
