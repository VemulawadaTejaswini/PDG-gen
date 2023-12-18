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
	 int a[]=fs.readArray(n);
	 boolean des=true;
	 for(int i=1;i<n;i++) {
		 if(a[i]>a[i-1]) {
			 des =false;
			 break;
		 }
	 }
	 if(des) {
		 System.out.println(1000);
		 return;
	 }
	 boolean ascen=true;
	 for(int i=1;i<n;i++) {
		 if(a[i]<a[i-1]) {
			 ascen =false;
			 break;
		 }
	 }
	 if(ascen) {
		 int stock=1000/a[0];
		 int rem=1000%a[0];
		 int sell=stock*a[n-1];
		 System.out.println(sell+rem);
		 return;
	 }
	long money=1000;
	 for(int start=0;start<n-1;start++) {
		 int end = start+1;
		 if(a[start]>=a[end]) continue;
		 long times = money/a[start];
		 money=money%a[start];
		 money+=times*a[end];
	 }
	 System.out.println(money);
	 
	 
	   
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
