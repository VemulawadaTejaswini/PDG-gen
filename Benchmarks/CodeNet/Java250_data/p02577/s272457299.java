import java.io.*;
import java.util.*;

class Main
{
  static boolean checkDivofNine(String str)
  {
	int n=str.length();
    int res=0;
    for(int i=0;i<n;i++)
    {
		res+=(str.charAt(i)-'0');
    }
      	return(res%9==0);
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
   	String str=sc.next();
    if(checkDivofNine(str))
    {
      System.out.print("Yes");
    }
    else
    {
      System.out.print("No");
    }
  }
}