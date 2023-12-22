import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String i = sc.next();
		String j = sc.next();
		StringBuffer a = new StringBuffer(j);
		String b = new String( a.reverse() );
		if( i.equals(b) ){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}