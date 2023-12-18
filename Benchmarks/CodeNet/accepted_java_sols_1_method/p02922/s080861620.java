import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String []s = br.readLine().split(" ");
		
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);

		int c=1,d=B-A;
		
		while(d>0)
		{
			d-=(A-1);
			++c;
		}
		
		if(B==1)
			c = 0;
			
		System.out.println(c);

	}
}