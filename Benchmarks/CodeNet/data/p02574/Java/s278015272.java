//package Atcoder;
import java.util.*;
import java.io.*;
public class Main
{
	static final int mod=(int)1e9+7;
	static final int inf=(int)1e9;
	static final long INF=(long)1e18;
	public static void main(String[] args)
	{
		FastScanner fs=new FastScanner();
		int factors[]=new int[1000001];
		for(int i=0;i<=factors.length-1;i++)
		{
			factors[i]=i;
		}
		for(int i=2;i*i<=factors.length-1;i++)
		{
			if(factors[i]==i)
			{
				for(int j=2*i;j<=factors.length-1;j+=i)
				{
					if(factors[j]==j)
					{
						factors[j]=i;
					}
				}
			}
		}
		int n=fs.nextInt();
		int gcd=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=fs.nextInt();
			gcd=fs.gcd(gcd,arr[i]);
		}
		if(gcd>1)
		{
			System.out.println("not coprime");
			return;
		}
		boolean visited[]=new boolean[factors.length];
		boolean ok=true;
		int min=inf;
		for(int i=0;i<n;i++)
		{
			while(arr[i]!=1)
			{
			int sf=factors[arr[i]];
			if(visited[factors[arr[i]]])
			{
				ok=false;
			}
			visited[factors[arr[i]]]=true;
			while(arr[i]%sf==0)
				arr[i]/=sf;
			}
		}
		if(ok==true)
			System.out.println("pairwise coprime");
		else
			System.out.println("setwise coprime");
	}
}
class FastScanner 
{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		public String next() 
		{
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
			
		}
		
		long pow(long x,long n)
		{
			long res=1;
			while(n>0)
			{
			   	if(n%2!=0)
			   	{
			   		res=(res*x);n--;
			   	}
			   	else
			   	{
			   		x=(x*x);n/=2;
			   	}
			}
			return res;
		}
		int gcd(int a,int b)
		{
			if(b==0)
			{
				return a;
			}
			return gcd(b,a%b);
		}
		long longgcd(long a,long b)
		{
			if(b==0)
			{
				return a;
			}
			return longgcd(b,a%b);
		}
		int[] sort(int arr[])
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i:arr)list.add(i);
			Collections.sort(list);
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=list.get(i);
			}
			return arr;
		}
		char[] charsort(char arr[])
	        {
	    	ArrayList<Character> list = new ArrayList<>();
	    	for(char c:arr)list.add(c);
	    	Collections.sort(list);
	    	for(int i=0;i<list.size();i++)
	    	{
	    		arr[i]=list.get(i);
	    	}
	    	return arr;
	        }
		long[] longsort(long arr[])
		{
			ArrayList<Long> list = new ArrayList<Long>();
			for(long i:arr)list.add(i);
			Collections.sort(list);
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=list.get(i);
			}
			return arr;
		}
		public int nextInt() 
		{
			return Integer.parseInt(next());
		}
		public int[] readArray(int n)
		{
			int[] arr=new int[n];
			for (int i=0; i<n; i++) arr[i]=nextInt();
			return arr;
		}	
		public long nextLong()
		{
			return Long.parseLong(next());
		}
		public long[] longreadArray(int n) 
		{
			long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextLong();
			return a;
		}
}