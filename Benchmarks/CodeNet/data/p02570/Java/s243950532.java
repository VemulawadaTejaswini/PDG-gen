

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;


class Main
{
	

	public static void main(String args[]) throws IOException
	{
		FastScanner fs = new FastScanner();
		int D = fs.nextInt();
		double T = fs.nextDouble();
		int S = fs.nextInt();
		System.out.println(((float)D/S <=T)?"Yes":"No");
	}

	static final Random random = new Random();
	
	static void ruffleSort(int arr[])
	{
		int n = arr.length;
		for(int i=0; i<n; i++)
		{
			int j = random.nextInt(n),temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			
		}
		Arrays.sort(arr);
	}
	

	static class Pairs implements Comparable<Pairs>
	{
		int value,index;
		Pairs(int value, int index)
		{
			this.value = value;
			this.index = index;
		}
		public int compareTo(Pairs p)
		{
			return Integer.compare(value,p.value);
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
	
	char nextChar() throws IOException {
		return next().charAt(0);
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
	byte nextByte() throws IOException 
	{
		return Byte.parseByte(next());
	}
	int [] arrayIn(int n) throws IOException
	{
		int  arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = nextInt();
		}
		return arr;
	}
}



	