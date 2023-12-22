import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int max=a;
    int min=a;
    int mid;
    int b=sc.nextInt();
    if(a>b)
    {
      min=b;
    }
    else
    {
      max=b;
    }
    int c=sc.nextInt();
    if(c>max)
    {
      mid=max;
      max=c;
    }
    else if(min>c)
    {
      mid=min;
      min=c;
    }
    else
    {
      mid=c;
    }
    System.out.print((max*10+mid)+min);
	}
}