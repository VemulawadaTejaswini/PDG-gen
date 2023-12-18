import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    String ans="";
    for(int i=0;i<str.length();i++)
    {
      char ch=str.charAt(i);
      if(ans.length()!=0 && ch=='B')
        ans=ans.substring(0,ans.length()-1);
      else if(ch=='0')
        ans=ans+"0";
      else if(ch=='1')
        ans=ans+"1";
    }
    System.out.println(ans);
  }
}