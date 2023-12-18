import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main
{
	static int bit[] ;
	public static void main(String[] args) {
		new Thread(null, new Runnable() {
			public void run() {
                solve();
            }
        }, "1", 1 << 26).start();
	}
	static void solve () {
		FastReader fr =new FastReader();	PrintWriter op =new PrintWriter(System.out);
 
 		int n =fr.nextInt() ,q =fr.nextInt() ,Q[][] =new int[q][3] ,c[] =new int[n+1] ,mx[] =new int[n+1] ,ans[] =new int[q] ,i ,j ;
 		for (i =0 ; i<n ; ++i)	c[i+1] =fr.nextInt() ;
 		for (i =0 ; i<q ; ++i) {	Q[i][1] =fr.nextInt() ;	Q[i][0] =fr.nextInt() ;	Q[i][2] =i ;	}
 		sort (Q , 0 , q-1) ;	bit =new int[n+1] ;	

 		i =0 ;	Arrays.fill(mx , -1) ;
 		for (j =0 ; j<q ; ++j) {
 			while (i+1 <= Q[j][0]) {
 				++i ;	if (mx[c[i]] != -1)	u (mx[c[i]] , n , -1) ;
 				mx[c[i]] =i ;	u (mx[c[i]] , n , 1) ;
 			}
 			ans[Q[j][2]] =qu (i) - qu (Q[j][1]-1) ;
 		}
 		for (i =0 ; i<q ; ++i)	op.println(ans[i]) ;
		op.flush();	op.close();
	}
	public static void sort(int[][] arr , int l , int u) {
		int m ;
 
		if(l < u){
			m =(l + u)/2 ;
 
			sort(arr , l , m);	sort(arr , m + 1 , u);
 
			merge(arr , l , m , u);
		}
	}
	public static void merge(int[][]arr , int l , int m , int u) {
		int[][] low = new int[m - l + 1][3];
 
		int[][] upr = new int[u - m][3];
 
		int i ,j =0 ,k =0 ;
 
		for(i =l;i<=m;i++){
			low[i - l][0] =arr[i][0];
			low[i - l][1] =arr[i][1];
			low[i - l][2] =arr[i][2];
		}
 
		for(i =m + 1;i<=u;i++){
			upr[i - m - 1][0] =arr[i][0];
			upr[i - m - 1][1] =arr[i][1];
			upr[i - m - 1][2] =arr[i][2];
		}
 
		i =l;
 
		while((j < low.length) && (k < upr.length))
		{
			if(low[j][0] < upr[k][0])
			{
				arr[i][0] =low[j][0];
				arr[i][1] =low[j][1];
				arr[i++][2] =low[j++][2];
			}
			else
			{
				if(low[j][0] > upr[k][0])
				{
					arr[i][0] =upr[k][0];
					arr[i][1] =upr[k][1];
					arr[i++][2] =upr[k++][2];
				}
				else
				{
					if(low[j][1] < upr[k][1])
					{
						arr[i][0] =low[j][0];
						arr[i][1] =low[j][1];
						arr[i++][2] =low[j++][2];
					}
					else
					{
						arr[i][0] =upr[k][0];
						arr[i][1] =upr[k][1];
						arr[i++][2] =upr[k++][2];
					}
				}
			}
		}
 
		while(j < low.length)
		{
			arr[i][0] =low[j][0];
			arr[i][1] =low[j][1];
			arr[i++][2] =low[j++][2];
		}
 
		while(k < upr.length)
		{
			arr[i][0] =upr[k][0];
			arr[i][1] =upr[k][1];
			arr[i++][2] =upr[k++][2];
		}
	}
	static void u (int id , int n , int v) {
		for ( ; id<=n ; id += (id&(-id)))	bit[id] += v ;
	}
	static int qu (int id) {
		int r =0 ;	for ( ; id>0 ; id -= (id&(-id)))	r += bit[id] ;
		return r ;
	}
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br =new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st==null || (!st.hasMoreElements())) 
			{
				try
				{
					st =new StringTokenizer(br.readLine());
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				
			}
			return st.nextToken();
		}

		String nextLine() {
			String str ="";

			try
			{
				str =br.readLine();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}

			return str;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next()) ;
		}
	}
}