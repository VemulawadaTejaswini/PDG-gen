import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.HashSet;

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
 
 		String s =fr.next() ;	char a[] ;	boolean f =false ;

 		int n =s.length() ,i ;	a =new char[n] ;	a =s.toCharArray() ;

 		ArrayList<Integer> pos =new ArrayList<>() ;

 		for (i =0 ; i<n ; ++i) {
 			if(a[i] != '0' && a[i] != '1' && a[i]!='7')	break;
 			if (a[i] == '1')
 				pos.add(i) ;
 			if (a[i] == '7')	f =true ;
 		}

 		HashSet<Integer> hs =new HashSet<>() ;

 		if (i==n) {
 			if (f) {
 				for (i =0 ; i<n ; ++i) {
 					if (a[i]!='7')	break;
 				}
 				if (i==n)	op.println(n) ;
 				else
 					op.println(-1) ;
 			}
 			else {
	 			if (a[n-1]=='1') {
	 				for (i =0 ; i+1<pos.size() ; ++i) {
	 					hs.add(pos.get(i+1) - pos.get(i)) ;
	 				}

	 				if (hs.size()<2) {
	 					if (n == 1)	op.println(1) ;
	 					else {
	 						for (int itr : hs) {
	 							i =itr ;
	 						}
	 						op.println(i*pos.size()) ;
	 					}
	 				}
	 				else
	 					op.println(-1) ;
	 			}
	 			else
	 				op.println(-1) ;
	 		}
 		}
 		else
 			op.println(-1) ;

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