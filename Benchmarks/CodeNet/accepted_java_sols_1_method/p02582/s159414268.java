import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char a = s.charAt(0);
		char b = s.charAt(1);
		char c = s.charAt(2);
		int res=0, flag = 0;
		if(a=='R') {
			res=1;
			if(b==a) {
				res++;
				if(c==b)
					res++;
			}
		}
		else {
			if(b=='R') {
				if(b==c)
					res+=2;
				else
					res++;
			}
			else {
				if(c=='R')
					res++;
			}
		}
		System.out.println(res);
		sc.close();

	}
}