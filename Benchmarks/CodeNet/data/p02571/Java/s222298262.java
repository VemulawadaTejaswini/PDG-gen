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
     char s[]=in.next().toCharArray();
     char t[]=in.next().toCharArray();
     int min=10001;
     for(int i=0;i<s.length-t.length+1;i++){
         Stack<Character> st=new Stack<>();
         for(int j=t.length-1;j>=0;j--) st.push(t[j]);
         int j=0;
         for(j=i;j<s.length;j++){
             if(st.peek()==s[j]) st.pop();
             if(st.isEmpty()) break;
         }
         if(st.isEmpty()) min=Math.min(min,j-i+1-t.length);
     }
     out.println(min);
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
