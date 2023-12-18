import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    String t=in.next();
    int n=in.nextInt();
    int b=in.nextInt();
    String u=in.next();
    if(u.compareTo(s)==0)
    {
      System.out.println((n-1)+" "+b);
    }
    else if(u.compareTo(t)==0)
    {
       System.out.println(n+" "+(b-1));
    }
   else
   {
     System.out.println(n+" "+b);
   }
  }
}