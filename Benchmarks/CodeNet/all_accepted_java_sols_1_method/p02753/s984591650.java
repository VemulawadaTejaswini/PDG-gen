import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int l=str.length();
    String result="";
    for(int i=0;i<l;i++)
    {
      char ch=str.charAt(i);
      result=result+ch;
    }
    if(result.equals("AAA")||result.equals("BBB"))
    {
      System.out.println("No");
    }
    else
    {
      System.out.println("Yes");
    }
  }
}