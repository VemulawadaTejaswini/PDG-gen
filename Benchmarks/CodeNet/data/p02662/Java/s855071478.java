//package com.company;
import java.io.*;
import java.util.*;
public class Main
{
	static boolean[][] dp;
	static long ans = 0;
	static long len=0;
	static long power(long x, long y, long p)
	{
		// Initialize result
		long res = 1;

		// Update x if it is more
		// than or equal to p
		x = x % p;

		if (x == 0) return 0; // In case x is divisible by p;

		while (y > 0)
		{
			// If y is odd, multiply x
			// with result
			if((y & 1)==1)
				res = (res * x) % p;

			// y must be even now
			// y = y / 2
			y = y >> 1;
			x = (x * x) % p;
		}
		return res;
	}
	static void display(ArrayList<Integer> v) {
		ans+=power(2,len-v.size(),998244353);
	}

	// A recursive function to print all subsets with the
	// help of dp[][]. Vector p[] stores current subset.
	static void printSubsetsRec(int arr[], int i, int sum,ArrayList<Integer> p) {
		// If we reached end and sum is non-zero. We print
		// p[] only if arr[0] is equal to sun OR dp[0][sum]
		// is true.
		if (i == 0 && sum != 0 && dp[0][sum]) {
			p.add(arr[i]);
			display(p);
			p.clear();
			return;
		}

		// If sum becomes 0
		if (i == 0 && sum == 0) {
			display(p);
			p.clear();
			return;
		}

		// If given sum can be achieved after ignoring
		// current element.
		if (dp[i - 1][sum]) {
			// Create a new vector to store path
			ArrayList<Integer> b = new ArrayList<>();
			b.addAll(p);
			printSubsetsRec(arr, i - 1, sum, b);
		}

		// If given sum can be achieved after considering
		// current element.
		if (sum >= arr[i] && dp[i - 1][sum - arr[i]]) {
			p.add(arr[i]);
			printSubsetsRec(arr, i - 1, sum - arr[i], p);
		}
	}

	// Prints all subsets of arr[0..n-1] with sum 0.
	static void printAllSubsets(int arr[], int n, int sum) {
		len=n;
		if (n == 0 || sum < 0)
			return;

		// Sum 0 can always be achieved with 0 elements
		dp = new boolean[n][sum + 1];
		for (int i = 0; i < n; ++i) {
			dp[i][0] = true;
		}

		// Sum arr[0] can be achieved with single element
		if (arr[0] <= sum)
			dp[0][arr[0]] = true;

		// Fill rest of the entries in dp[][]
		for (int i = 1; i < n; ++i)
			for (int j = 0; j < sum + 1; ++j)
				dp[i][j] = (arr[i] <= j) ? (dp[i - 1][j] ||
						dp[i - 1][j - arr[i]])
						: dp[i - 1][j];
		if (dp[n - 1][sum] == false) {
			return;
		}

		// Now recursively traverse dp[][] to find all
		// paths from dp[n-1][sum]
		ArrayList<Integer> p = new ArrayList<>();
		printSubsetsRec(arr, n - 1, sum, p);
	}
	public static void main(String args[])
	{
		new Main().run();
	}
	public void solve()throws IOException
	{
		//Scanner sc=new Scanner(System.in);
		int n=nextInt();
		int k=nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=nextInt();
		}
		printAllSubsets(a, n, k);
		writer.println(ans%998244353);


	}
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;

	public void run() {
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}

	String nextToken() throws IOException {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
}
class Graph
{
	private int V;
	private LinkedList<Integer> adj[];
	private int visited1[];
	Graph(int v)
	{
		V = v;
		visited1 = new int[V];
		adj = new LinkedList[v];
		for (int i=0; i<v; i++)
		{   adj[i] = new LinkedList();
		}
	}

	void addEdge(int v, int w)
	{
		adj[v].add(w);
		adj[w].add(v);// Add w to v's list.
	}

	void DFSUtil(int v,boolean visited[],int k)
	{
		// Mark the current node as visited and print it
		visited[v] = true;
		//System.out.println(k+" "+v);
		visited1[k]+=1;

		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext())
		{
			int n = i.next();
			//System.out.println(n+"&");
			if (!visited[n])
				DFSUtil(n, visited,k+1);
		}
	}

	// The function to do DFS traversal. It uses recursive DFSUtil()
	int[] DFS(int v)
	{
		// Mark all the vertices as not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[V];

		// Call the recursive helper function to print DFS traversal
		DFSUtil(v, visited,0);
		return visited1;
	}


}