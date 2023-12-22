import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String []s=br.readLine().split(" ");
		long A = Long.parseLong(s[0]);
		long B = Long.parseLong(s[1]);
		long K = Long.parseLong(s[2]);
		long aoki=B,taka=A;
		
		if(K<=A)
			taka=A-K;
		else if(K<A+B) //Atcoder Editorial's solution
		{
			taka=0;
			aoki=B-(K-A);
		}
		else
		{
			aoki=0;
			taka=0;
		}
		
		out.println(taka+" "+aoki);
	
	}
}


