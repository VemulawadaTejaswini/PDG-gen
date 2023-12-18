import java.util.*;
public class Main
{
  public static void main(String args[])throws Exception
  {
    try {
    Scanner sc=new Scanner(System.in);
    int x,y,t,c;
      x=sc.nextInt();
      y=sc.nextInt();
      if(y%2!=0)
        System.out.println("No");
      else
      {
        t=y/2-x;
        c=x-t;
        if(t>=0 && c>=0)
          System.out.println("Yes");
        else
          System.out.println("No");
      }
    } catch(Exception e) { return;
                         } finally {
    }
  }
}
    
