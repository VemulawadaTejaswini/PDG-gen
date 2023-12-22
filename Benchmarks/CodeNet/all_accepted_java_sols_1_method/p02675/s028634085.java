import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		    Scanner sc=new Scanner(System.in);
		    String s=sc.next();
		    char ch=s.charAt(s.length()-1);
		    if(ch=='2'||ch=='4'||ch=='5'||ch=='7'||ch=='9')
		    System.out.println("hon");
		    else if(ch=='0'||ch=='1'||ch=='6'||ch=='8')
		    System.out.println("pon");
		    else
		    System.out.println("bon");
		} catch(Exception e) {
		} finally {
		}
	}
}