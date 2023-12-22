import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    String s=sc.nextLine();
    if(n%2!=0)
      System.out.println("No");
    else
    {
      boolean b=true;
      for(int i=n/2-1,j=n-1;i>=0;i--,j--)
      {
        if(s.charAt(i)!=s.charAt(j))
        {
          b=false;
          break;
        }
      }
      if(b)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
  }
}
