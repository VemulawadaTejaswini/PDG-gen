import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for(int i=1;i<=9;i++)
    {
      if(n%i==0)
      {
        if(n/i<=9)
        {
          System.out.println("Yes");
          System.exit(0);
        }
      }
    }
    System.out.println("No");
  }
}
