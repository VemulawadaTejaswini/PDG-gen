
//template
import java.util.*;
import java.util.stream.Stream;
import java.io.*;
public class Main{
	static BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException{
		StringTokenizer st=new StringTokenizer(in.readLine());
		int N=Integer.parseInt(st.nextToken());
		int X=Integer.parseInt(st.nextToken());
		int T=Integer.parseInt(st.nextToken());
		int times=0;
		int sum=0;
		while(sum<N) {
			sum+=X;
			times++;
		}
		out.append(times*T+"");
		
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