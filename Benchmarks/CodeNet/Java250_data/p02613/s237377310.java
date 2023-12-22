

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main

{	
	public static void main(String args[]) throws IOException
	{
		FastScanner fs = new FastScanner();
		int T = fs.nextInt();
		int AC = 0,TLE =0, RE =0, WA = 0 ;
		while(T-- >0)
		{
			char ch = fs.next().charAt(0);
			if(ch == 'A') AC++;
			else if(ch == 'T') TLE++;
			else if(ch == 'R') RE++;
			else WA++;
				
		}
		System.out.println("AC x "+AC+"\nWA x "+WA+"\nTLE x "+TLE+"\nRE x "+RE);
	}


}
class FastScanner
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer str = new StringTokenizer("");
	
	String next() throws IOException
	{
		while(!str.hasMoreTokens())
			str = new StringTokenizer(br.readLine());
		
		return str.nextToken();
	}
	
	int nextInt() throws IOException
	{
		return Integer.parseInt(next());
	}
	
	float nextfloat() throws IOException
	{
		return Float.parseFloat(next());
	}
	
	double nextDouble() throws IOException
	{
		return Double.parseDouble(next());
	}
	long nextLong() throws IOException
	{
		return Long.parseLong(next());
	}
	int [] arrayIn(int n) throws IOException
	{
		int  arr[] = new int[n];
		arr[0] = 0;
		for(int i=1; i<n; i++)
		{
			arr[i] = nextInt();
		}
		return arr;
	}
}



	