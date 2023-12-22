import java.io.*;
import java.util.*;
//import javafx.util.Pair;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String []s=br.readLine().split(" ");
		long n = Long.parseLong(s[0]);
		long a = Long.parseLong(s[1]);
		long b = Long.parseLong(s[2]);
		
		long ans=((n/(a+b))*a)+min(a,n%(a+b));
		/*
		1. n/(a+b) is the number of times n can be divided by (a+b), considering a+b as 1 unit and finding the number of such a+b units that is a part of n.
		2. Now that we have the number of times n is divisible by a+b, multiply it by the number of blue balls actually present
		3. And the number of balls remaining after n is divided by (a+b) will contain either n%(a+b) blue balls or a blue balls.
		
		*/
		
		out.println(ans);
		
		
	}
	
	
}


