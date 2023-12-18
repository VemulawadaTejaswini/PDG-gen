import java.util.*;
import java.lang.*;
public class A
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int r=0,count_r = 0;
    for(int i=0;i<3;i++)
    {
      if(s.charAt(i)=='R')
        r++;
      if(i<3 && s.charAt(i)=='R' && s.charAt(i+1)=='R')
        count_r++;
    }
    if(count_r==0)
      System.out.println(r);
    else
      System.out.println(count_r);
  }
}