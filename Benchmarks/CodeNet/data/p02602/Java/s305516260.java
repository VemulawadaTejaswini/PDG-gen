import java.io.*;
import java.util.*;
import java.lang.*;
public class Codechef {
	PrintWriter out;
    StringTokenizer st;
    BufferedReader br;
 	
 	class Pair implements Comparable<Pair>
	{
	    int f;
	    int s;
 
	    Pair(int t, int r) {
	       f = t;
	       s = r;
	    }
	    public int compareTo(Pair p)
	    {
	    	if(this.f!=p.f)
	    		return this.f-p.f;
 
	    	return this.s-p.s;
	    }
 	}
 // 	class Sort implements Comparator<String> 
	// { 
	//     public int compare(String a, String b) 
	//     { 
	//     	return (a+b).compareTo(b+a);
	//     } 
	// }
 
	String ns() {
        while (st == null || !st.hasMoreElements()) {
 
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
 
    String nextLine() throws Exception {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            throw new Exception(e.toString());
        }
        return str;
    }
 
    int nextInt() {
        return Integer.parseInt(ns());
    }
 
    long nextLong() {
        return Long.parseLong(ns());
    }
 
    double nextDouble() {
        return Double.parseDouble(ns());
    }
	
	int upperBound(long a[],long key)
	{
		int l=0,r=a.length-1;
		int i=-1;
 
		while(l<=r)
		{
			int mid=(l+r)/2;
 
			if(a[mid]<key)
				l=mid+1;
 
			else{
				i=mid;	
				r=mid-1;
			}
			
		}
		return i;
	}
	int lowerBound(Pair[] a , long key)
	{
		int l = 0, r = a.length- 1;
		int i = -1;
 	
		while(l<=r)
		{
			int mid=(l+r)/2;
 
			if(a[mid].f<key)
			{
				i=mid;
				l=mid+1;	
			}
 
			else
				r=mid-1;
			
		}
		return i;
	}
 
	long power(long x,long y)
	{
	    long ans=1;
	    
	    while(y!=0)
	    {
	        if(y%2==1) ans=(ans*x)%mod;
	        x=(x*x)%mod;
	        y/=2;
	    }
	    return ans%mod;
	}
	
 
	int mod= 1000000007;
	long gcd(long x ,long y)
	{
		if(y==0)
			return x;
		return gcd(y,x%y);
	}
 
	// ArrayList<Integer> a[];
	// TreeMap<Integer, Long> map;
	// int vis[];
	// long d[];
	// void dfs(int ver, int m)
	// {
	// 	map.put(ver, d[m % 3]);
	// 	for(int v : a[ver])
	// 	{
	// 		if(vis[v] == 0){
	// 			vis[v] = vis[ver] + 1;
	// 			dfs(v, m + 1);
	// 		}
	// 	}
	// }
 
 	int countSetBits(long n) 
    { 
        int count = 0; 
        while (n > 0) { 
            n &= (n - 1); 
            count++; 
        } 
        return count; 
    }

	void solve() throws IOException{
		int t = nextInt();
		while(t -- > 0)
		{
			int n = nextInt();
			char a[] = ns().toCharArray();
			char b[] = ns().toCharArray();
			HashSet<Character> set[] = new HashSet[21];
			for(int i = 0; i < 21; i++)
				set[i] = new HashSet<Character>();
			boolean ok = true;
			for(int i = 0; i < n; i++)
			{
				if(a[i] > b[i]){
					ok = false;
					break;
				}
			}
			if(ok)
			{
				int cnt = 0;
				for(int i = 0; i < n; i++)
				{
					if(!set[a[i] - 'a'].contains(b[i]))
						set[a[i] - 'a'].add(b[i]);
				}
				for(int i = 0; i < 21; i++)
					cnt += set[i].size();
				out.println(cnt);
			}
			else
				out.println(-1);
		}
	}
	
	
    void run() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
		solve();
		out.flush();
 
		out.close();
	}
 
	public static void main(String args[]) throws IOException {
		new Codechef().run();
	}
}

