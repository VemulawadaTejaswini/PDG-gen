
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
		int M = 1000000007;
		int n =fs.nextInt();
		int arr[] = fs.arrayIn(n);
		long sum=0;
		long suffixSum[] = new long[n+1];

		for(int i=n-1; i>0; i--)
		{
			suffixSum[i] = (suffixSum[i+1]+arr[i])%M;
		}
		
		for(int i=1; i<n; i++)
		{
			sum += (arr[i-1]*suffixSum[i])%M;
		}
		System.out.println(sum%M);
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



	
