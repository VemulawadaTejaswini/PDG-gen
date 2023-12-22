import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int h,a,c=0;
    h=in.nextInt();
    a=in.nextInt();
    while(h>0)
    {
      h=h-a;
      c=c+1;
    }
    System.out.println(c);
  }
}
