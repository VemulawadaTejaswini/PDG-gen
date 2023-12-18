import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

public class Main
{
	public static void main(String[] args) {
		new Thread(null, new Runnable() {
			public void run() {
                solve();
            }
        }, "1", 1 << 26).start();
	}
	static void solve () {
		FastReader fr =new FastReader();	PrintWriter op =new PrintWriter(System.out);
 
 		int n =fr.nextInt() ,m =fr.nextInt() ,a[] =new int[n] ,i ,j ,k ;	ArrayList<ArrayList<Integer>> g =new ArrayList<>() ;
 		for (i =0 ; i<n ; ++i)	g.add(new ArrayList<>()) ;	boolean mrk[] =new boolean[n] ;
 		while (m-->0) {
 			i =fr.nextInt()-1 ;	j =fr.nextInt()-1 ;
 			g.get(i).add(j) ;	g.get(j).add(i) ;
 		}
 		Queue<Integer> q =new LinkedList<>() ;	q.add(0) ;	mrk[0] =true ;
 		while (!q.isEmpty()) {
 			i =q.poll() ;
 			for (j =0 ; j<g.get(i).size() ; ++j) {
 				k =g.get(i).get(j) ;	if (mrk[k])	continue;
 				a[k] =i+1 ;	mrk[k] =true ;	q.add(k) ;
 			}
 		}
 		for (k =0 ; k<n ; ++k) {
 			if (!mrk[k])	break;
 		}
 		if (k==n) {
 			op.println("Yes") ;
 			for (i =1 ; i<n ; ++i)	op.println(a[i]) ;	
 		}
 		else 	op.println("No") ;
		op.flush();	op.close();
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