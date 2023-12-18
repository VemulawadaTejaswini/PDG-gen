import java.util.*;
import java.io.*;
import java.math.BigDecimal; 
import java.math.BigInteger; 
class Main
{
	static boolean visited[];
	static long dp[][][];
	static long MOD=1000000007L;
	static Hashtable<String , Long>hash=new Hashtable<>();
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			// String h[]=inp.readLine().split(" ");
			// String h[]=inp.readLine().split(" ");
		// int n=Integer.parseInt(inp.readLine());
		long a=Long.parseLong(inp.readLine());
		if(prime(a)){System.out.println(1);}
		else{
			long ans=0;
		ArrayList<Long>pp=new ArrayList<>();
		for(int i=2;i<=Math.sqrt(a);i++)
		{
			if(prime(i) && a%i==0)
			{
				pp.add((long)i);			}

		}

		for(int i=0;i<pp.size();i++)
		{
			if(a<pp.get(i)){break;}
			long y=pp.get(i);
			while(a%y==0)
			{
				a/=y;
				y*=pp.get(i);
				ans+=1;
			}

		}
		System.out.println(ans);

	}
		// System.out.println(a);
		
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
	static long get(int a[], int d, int sum, int tight, int i)
	{
		if(i==a.length){if(sum%d==0 && sum!=0){return 1;}return 0;}
		// if(dp[i][sum][tight]!=-1){return dp[i][sum][tight];}
		String s=i+" "+sum+" "+tight;
		if(hash.containsKey(i+" "+sum+" "+tight) && tight!=1){return hash.get(i+" "+sum+" "+tight);}
		long ans=0;
		
		int limit=(tight==0?9:a[i]);
			for(int j=0;j<=limit;j++)
			{
				int newt=(a[i]==j?tight:0);

				ans=(ans%MOD+get(a,d,sum+j,newt,i+1)%MOD)%MOD;
			}
			// dp[i][sum%d][tight]=ans;
			hash.put(s,ans);
			return ans;	
	}


	
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