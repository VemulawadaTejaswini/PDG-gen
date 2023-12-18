import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
	   
	    	int n=fs.nextInt();
	        long d=fs.nextLong();
	        long a[][]=new long[n][2];
	        for(int i=0;i<n;i++) {
	        	a[i][0]=fs.nextLong();
	        	a[i][1]=fs.nextLong();
	        	
	        }
	        int count=0;
	        for(int i=0;i<n;i++) {
	        	long t1=a[i][0]*a[i][0];
	        	t1=t1<0?-t1:t1;
	        	long t2=a[i][1]*a[i][1];
	        	t2=t2<t2?-t2:t2;
	        	double temp=Math.sqrt(t1+t2);
	        	temp=Math.ceil(temp);
//	        	System.out.println(temp);
	        	if( temp-d<=0) {
	        		count++;
	        	}
	        }
	        System.out.println(count);
	    }
	
	
	static void sort(int[] a ) {
		ArrayList<Integer> l = new ArrayList<>();
		for(int i:a) l.add(i);
		Collections.sort(l);
		for(int i=0;i<l.size();i++) a[i]=l.get(i);
	}
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {
			while(!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				}catch(IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a = new int[n];
			for(int i=0;i<n;i++)a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
