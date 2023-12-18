

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main
{	
	
	
	public static void main(String args[]) throws IOException
	{
		FastScanner fs = new FastScanner();
		int N = fs.nextInt()/100;
		
		switch (N)
		{
			case 4:
			case 5: System.out.println(8);
			break;
			case 6:
			case 7: System.out.println(7);
			break;
			case 8:
			case 9: System.out.println(6);
			break;
			case 10:
			case 11: System.out.println(5);
			break;
			case 12:
			case 13: System.out.println(4);
			break;
			case 14:
			case 15: System.out.println(3);
			break;
			case 16:
			case 17: System.out.println(2);
			break;
			case 18:
			case 19: System.out.println(1);
			break;
		}

			
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
	int[] arrayIn(int n) throws IOException
	{
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = nextInt();
		}
		return arr;
	}
}



	