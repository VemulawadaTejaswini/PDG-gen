import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int flag1=1,flag2=1,flag3=1;
		String temp="";
		int N=s.length();
      if(N%2!=0)
      {
		// to check if palindrome;
		for(int i=N-1;i>=0;i--)
		{
			char a=s.charAt(i);
			temp=temp+a;
		}
		if(temp.equals(s))
		{
			flag1=1;
		}
		else
			flag1=0;
		//System.out.print(flag);
		// 2nd condition
		
		int end=(int)((N-1)/2);
		String temp2="";
		temp="";
		for(int i=0;i<end;i++)
		{
			temp2=temp2+s.charAt(i);
		}
		for(int i=end-1;i>=0;i--)
		{
			temp=temp+s.charAt(i);
		}
		if(temp2.equals(temp))
		{
			flag2=1;
		}
		else
			flag2=0;
		//System.out.print(flag);
		//check for 3rd condition
		end=(int)((N+3)/2);
		temp2="";
		temp="";
		for(int i=end-1;i<=N-1;i++)
		{
			temp2=temp2+s.charAt(i);
		}
		for(int i=N-1;i>=end-1;i--)
		{
			temp=temp+s.charAt(i);
		}
		if(temp2.equals(temp))
		{
			flag3=1;
		}
		else
			flag3=0;
		//System.out.print(flag);
		//condition check for strong palindrome
		if(flag1==1 && flag2==1 && flag3==1)
		{
			System.out.println("Yes");
			
		}
		else
		{
			System.out.println("No");
		}
}
}
}