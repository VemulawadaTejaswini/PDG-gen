import java.util.*;
import java.io.*;
import java.math.BigDecimal; 
import java.math.BigInteger; 
class Main
{
	static boolean visited[];
	static long dp[][];
	static long MOD=1000000007L;
	static Hashtable<String , Long>hash=new Hashtable<>();
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		// long x1=Long.parseLong(a[0]);
		int t=Integer.parseInt(inp.readLine());
		while(t-->0){
		int n=Integer.parseInt(inp.readLine());
		String a[]=inp.readLine().split(" ");
		long x=0;
		String s=inp.readLine();
		long arr[]=new long[s.length()];
		for(int i=0;i<s.length();i++)
		{
			arr[i]=Long.parseLong(a[i]);
			// if(s.charAt(i)=='0'){if(x!=0){x=x^c;}}
			// if(s.charAt(i)=='1'){if(x==0){x=x^c;}}

		}
		boolean aa=get(0,s,arr,0);
		System.out.println(aa?0:1);
	}
	


	}
	static boolean get(long x, String s, long arr[], int i)
	{
		if(i==s.length()){return x==0?true:false;}
		if(s.charAt(i)=='1')
		{
			boolean a=get(x^arr[i],s,arr,i+1);
			if(!a){return a;}
			return get(x,s,arr,i+1);
		}
		boolean a=get(x^arr[i],s,arr,i+1);
		if(a){return true;}
		return get(x,s,arr,i+1);
	}
		// System.out.println(a);
		
	
	// static long get(int i,int pre, int n, int arr[],boolean visited[])
	// {
	// 	if(i==n){return 1;}
	// 	long ans=0;
	// 	if(dp[i][pre]!=-1){return dp[i][pre];}
	// 	if(arr[i]==1)
	// 	{
	// 		for(int k=pre+1;k<=n;k++)
	// 		{
	// 			if(!visited[k])
	// 			{
	// 				visited[k]=true;
	// 				ans=(ans%MOD+get(i+1,k,n,arr,visited)%MOD)%MOD;
	// 				visited[k]=false;
	// 			}
	// 		}
	// 		dp[i][pre]=ans;
	// 		return ans;
	// 	}
	// 	for(int k=1;k<pre;k++)
	// 	{
	// 		if(!visited[k])
	// 		{
	// 			visited[k]=true;
	// 			ans=(ans%MOD+get(i+1,k,n,arr,visited)%MOD)%MOD;
	// 			visited[k]=false;
	// 		}
	// 	}
	// 	dp[i][pre]=ans;
	// 	return ans;

	// }
	static long getall(int gg[], long arr[][], int i, int g)
	{
		if(i==arr.length)
		{
			long ans=0;
			for(int j=0;j<=g;j++)
			{
				ArrayList<Integer>arr1=new ArrayList<>();
				for(int k=0;k<gg.length;k++)
				{
					if(gg[k]==j){arr1.add(k);}
				}
				for(int k=0;k<arr1.size()-1;k++)
				{
					for(int l=k+1;l<arr1.size();l++)
					{
						ans+=arr[arr1.get(k)][arr1.get(l)];
					}
				}
			}
			return ans;
		}
		String s=Arrays.toString(gg);
		// if(hash.containsKey(s)){return hash.get(s);}
		if(dp[i][g]!=0){return dp[i][g];}
		gg[i]=g+1;
		long max=getall(gg,arr,i+1,g+1);
		for(int k=0;k<=g;k++)
		{
			gg[i]=k;
			max=Math.max(getall(gg,arr,i+1,g),max);
		}
		dp[i][g]=max;
		// hash.put(s,max);
		return max;
	}
	static boolean prime(long n)
	{
		if(n==1){return false;}
        if (n <= 3) 
            return true; 
  
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
  
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
  
        return true; 
	}
	static int[] gg(String y){
		int a[]=new int[y.length()];
		for(int i=0;i<y.length();i++)
		{
			a[i]=(int)y.charAt(i)-(int)'0';
		}
		return a;
	}
	// static long get(int a[], int d, int sum, int tight, int i)
	// {
	// 	if(i==a.length){if(sum%d==0){return 1;}return 0;}
	// 	// if(dp[i][sum][tight]!=-1){return dp[i][sum][tight];}
	// 	// String s=i+" "+sum+" "+tight;
	// 	if(dp[i][sum][tight]!=-1){return dp[i][sum][tight];}
	// 	long ans=0;
		
	// 	int limit=(tight==0?9:a[i]);
	// 		for(int j=0;j<=limit;j++)
	// 		{
	// 			int newt=(a[i]==j?tight:0);

	// 			ans=(ans%MOD+get(a,d,(sum+j)%d,newt,i+1)%MOD)%MOD;
	// 		}
	// 		dp[i][sum%d][tight]=ans;
	// 		// hash.put(s,ans);
	// 		return ans;	
	// }


	
	// static long bfs(int src, ArrayList<ArrayList<Integer>>arr)
	// {
	// 	Queue<Pair>q=new LinkedList<>();
	// 	q.add(new Pair(src,1,1));
	// 	visited[src]=true;
	// 	long ans=0;
	// 	while(q.size()!=0)
	// 	{
	// 		ans=0;
	// 		int size=q.size();
	// 		for(int j=0;j<size;j++)
	// 		{
	// 			Pair t=q.poll();
	// 			ans=(ans%MOD+(t.b%MOD+t.c%MOD)%MOD)%MOD;
	// 			for(Integer node:arr.get(t.a))
	// 			{
	// 				if(!visited[node])
	// 				{
	// 					visited[node]=true;
	// 					q.add(new Pair(node,t.b+t.c,t.b));
	// 				}
	// 			}
	// 		}
	// 	}
	// 	return ans%MOD;
	// }
}
class Pair
{
	
	long a;
	long b;
	Pair(long f, long h)
	{
		
		a=f;
		b=h;
	}
}