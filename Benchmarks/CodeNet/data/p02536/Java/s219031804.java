//package Atcoder;
import java.util.*;
import java.io.*;
public class Main
{
	static boolean vis[]=new boolean[(int)1e6+1];
	static final int mod=(int)1e9+7;
	static final int inf=(int)1e9;
	static final long INF=(long)1e18;
	public static void main(String[] args)
	{
		FastScanner fs=new FastScanner();
		int nodes=fs.nextInt();
		int edges=fs.nextInt();
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=nodes+1;i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		for(int i=1;i<=edges;i++)
		{
			int u=fs.nextInt();
			int v=fs.nextInt();
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		int cc=0;
		int ans=0;
		for(int i=1;i<=nodes;i++)
		{
			if(!vis[i])
			{
				dfs(i,adj);
				cc++;
			}
		}
		ans+=(cc-1);
		for(int i=1;i<=nodes;i++)
		{
			if(!vis[i])
				ans++;
		}
		System.out.println(ans);
	}
	public static void dfs(int node,ArrayList<ArrayList<Integer>> adj)
	{
		vis[node]=true;
		for(int child:adj.get(node))
		{
			if(!vis[child])
				dfs(child,adj);
		}
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