
//template
import java.util.*;
import java.util.stream.Stream;
import java.io.*;
public class Main{
	static BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException{
		
		StringTokenizer st=new StringTokenizer(in.readLine());
		long x=Long.parseLong(st.nextToken());
		long k=Long.parseLong(st.nextToken());
		long d=Long.parseLong(st.nextToken());
		long total=k*d;
		long aux=x/d;
		if(aux<=k) {
			if(x%(aux*d)==0) {
				aux--;
				total=aux*d;
				x-=total;
			}else {
				total=aux*d;
				x-=total;
			}
		}else {
			total=k*d;
			x-=total;
		}
		out.append(x+"\n");
		
		out.flush();
		in.close();
		out.close();
	}
	public static boolean palindrome(String s) {
		boolean palindrome=true;
		int i=0,j=s.length()-1;
		while(i<j&&palindrome) {
			if(s.charAt(i++)!=s.charAt(j--))
				palindrome=false;
		}
		return palindrome;
	}
	public static long reverse(String s) {
		String aux="";
		for(int i=s.length()-1;i>=0;i--) {
			aux+=s.charAt(i);
		}
		return Long.parseLong(aux);
	}
	private static int modulo(int S, int N) { return ((S) & (N - 1)); } // returns S % N, where N is a power of 2
	private static int isPowerOfTwo(int S) { return (S & (S - 1)) == 0 ? 1 : 0; }
	private static int[] readInts() throws IOException {
		return Stream.of(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	}
	private static int readInt() throws IOException {
		return Integer.parseInt(in.readLine());
	}
	private static long[] readLongs() throws IOException {
		return Stream.of(in.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
	}
	private static long readLong() throws IOException {
		return Long.parseLong(in.readLine());
	}
	 
}