import java.util.*;
class a
{
  public static void main(String args[])
  {
    String s,t;
  int count=0,i,l;
    Scanner sc=new Scanner(System.in);
  s=sc.next();
  t=sc.next();
    l=s.length;
  for(i=0;i<l;i++)
  {
    if(s[i]!=t[i])
    {
      count++;
    }
  }
  System.out.println(count);
  }
}
