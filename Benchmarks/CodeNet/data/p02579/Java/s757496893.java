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
    static int t,min,n,m;
    static int cost[];
    static boolean visit[];
    static void dfs(int s,ArrayList<Integer> e[],int c){
        if(s==t) { min=Math.min(min,c); cost[s]=c; return; }
        visit[s]=true;
        for(int i:e[s]){
            if(!visit[i]){ int t=c; if(Math.abs(i-s)!=1&&Math.abs(i-s)!=m) t+=1; dfs(i,e,t); }
            if(cost[i]!=Integer.MAX_VALUE){ cost[s]=Math.min(cost[s],cost[i]+c); min=Math.min(cost[s],min); }
        }
        return;
    }
    static void solve(FastScanner in,PrintWriter out){
      n=in.nextInt();
      m=in.nextInt();
      int x0=in.nextInt()-1,y0=in.nextInt()-1;
      int x=in.nextInt()-1,y=in.nextInt()-1;
      char ch[][]=new char[n][m];
      for(int i=0;i<n;i++) ch[i]=in.next().toCharArray();
      int num[][]=new int[n][m];
      int c=1;
      int s=0; t=0;
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++) { num[i][j]=(c++); if(i==x0&&j==y0) s=num[i][j]; if(i==x&&j==y) t=num[i][j];   }
      }
      ArrayList<Integer> edge[]=new ArrayList[n*m+1];
      Arrays.setAll(edge,e-> new ArrayList<Integer>());
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              if(ch[i][j]=='#') continue;
              int flag=0;
              if(i-1>=0&&ch[i-1][j]=='.'){ edge[num[i][j]].add(num[i-1][j]); flag=1; } 
              else if(i-2>=0&&ch[i-2][j]=='.') { edge[num[i][j]].add(num[i-2][j]); flag=1; }
              
              if(j-1>=0&&ch[i][j-1]=='.') { edge[num[i][j]].add(num[i][j-1]); flag=1; } 
              else if(j-2>=0&&ch[i][j-2]=='.') { edge[num[i][j]].add(num[i][j-2]); flag=1; }
              
              if(i+1<n&&ch[i+1][j]=='.') { edge[num[i][j]].add(num[i+1][j]); flag=1; } 
              else if(i+2<n&&ch[i+2][j]=='.'){ flag=1; edge[num[i][j]].add(num[i+2][j]); }
              
              if(j+1<m&&ch[i][j+1]=='.') { edge[num[i][j]].add(num[i][j+1]); flag=1; }
              else if(j+2<m&&ch[i][j+2]=='.'){ edge[num[i][j]].add(num[i][j+2]); flag=1; }
              //...XXXXXXXXX
              if(flag==0) continue;
              if(i-1>=0&&j-1>=0&&ch[i-1][j-1]=='.'){ edge[num[i][j]].add(num[i-1][j-1]); flag=1; } 
              else if(i-2>=0&&j-2>=0&&ch[i-2][j-2]=='.') { edge[num[i][j]].add(num[i-2][j-2]); flag=1; }
              
              if(j-1>=0&&i+1<n&&ch[i+1][j-1]=='.') { edge[num[i][j]].add(num[i+1][j-1]); flag=1; } 
              else if(j-2>=0&&i+2<n&&ch[i+2][j-2]=='.') { edge[num[i][j]].add(num[i+2][j-2]); flag=1; }
              
              if(i+1<n&&j+1<m&&ch[i+1][j+1]=='.') { edge[num[i][j]].add(num[i+1][j+1]); flag=1; } 
              else if(i+2<n&&j+2<m&&ch[i+2][j+2]=='.'){ flag=1; edge[num[i][j]].add(num[i+2][j+2]); }
              
              if(j+1<m&&i-1>=0&&ch[i-1][j+1]=='.') { edge[num[i][j]].add(num[i-1][j+1]); flag=1; }
              else if(j+2<m&&i-2>=0&&ch[i-2][j+2]=='.'){ edge[num[i][j]].add(num[i-2][j+2]); flag=1; }
          }
      }
      cost=new int[n*m+1]; Arrays.fill(cost,Integer.MAX_VALUE);
      min=Integer.MAX_VALUE;
      visit=new boolean[n*m+1];
      dfs(s,edge,0);
      if(min==Integer.MAX_VALUE) out.println(-1);
      else out.println(min);
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
