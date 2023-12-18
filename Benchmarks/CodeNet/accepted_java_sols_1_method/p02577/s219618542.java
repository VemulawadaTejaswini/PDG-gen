import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int i,s=0;
    String n;
    Scanner sc= new Scanner(System.in);
    n=sc.next();
    for(i=0;i<n.length();i++)
      s+=n.charAt(i)-'0';
    if (s%9==0)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
 