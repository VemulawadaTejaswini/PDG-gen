import java.util.*;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    int count=0;
    for(int i=0;i<s.length();i++)
    {
      char c1=s.charAt(i);
      char c2=t.charAt(i);
      if(c1!=c2)
        count++;
    }
    System.out.println(count);
  }
}