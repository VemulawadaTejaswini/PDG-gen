import java.io.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		FastScanner in=new FastScanner();
		PrintWriter out=new PrintWriter(System.out);
	//	int t=in.nextInt();
	//	while(t-->0)
		solve(in,out);
		out.close();
	}

    static void solve(FastScanner in,PrintWriter out){
     int n=in.nextInt();
     int m=in.nextInt();
     int k=in.nextInt();
     int a[][]=new int[n][m];
     for(int i=0;i<k;i++){
         int x=in.nextInt()-1; int y=in.nextInt()-1; 
         a[x][y]=in.nextInt();
     }
     long dp[][]=new long[n][m];
     for(int i=0;i<n;i++){
         PriorityQueue<Integer> p=new PriorityQueue<>(); 
         for(int j=0;j<m;j++){
             if(i==0&&j==0) { dp[i][j]=a[i][j]; if(a[i][j]!=0) p.add(a[i][j]); continue; }
             if(i==0||j==0) { if(j!=0){  if(a[i][j]!=0) { p.add(a[i][j]); dp[i][j]=a[i][j]+dp[i][j-1]; if(p.size()>3) dp[i][j]-=p.poll(); } else dp[i][j]=dp[i][j-1]; }
             else { dp[i][j]=dp[i-1][j]+a[i][j]; if(a[i][j]!=0) p.add(a[i][j]); } continue; }
             if(a[i][j]!=0) {long left=0; p.add(a[i][j]); left=a[i][j]+dp[i][j-1]; if(p.size()>3) left-=p.poll(); if(left<=dp[i-1][j]+a[i][j]){ p.clear(); } dp[i][j]=Math.max(dp[i-1][j]+a[i][j],left); } 
             else{ if(dp[i][j-1]<=dp[i-1][j]){ p.clear(); } dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]); }

         }
     }
     out.println(dp[n-1][m-1]);
    }    
	



	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

	
}
