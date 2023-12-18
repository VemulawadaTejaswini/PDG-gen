
//template
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class Main{
	static BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	private static final int HUNDRED = 100;
	public static void main(String[] args) throws IOException{
		
		String s=in.readLine();
		String t=in.readLine();
		int i=s.length()-t.length();
		int ans=0;
		if(i==0) {
			for(int x=0;x<s.length();x++) {
				if(s.charAt(x)==t.charAt(x))
					ans++;
			}
			out.append(t.length()-ans+"");
		}else {
			for(int x=0;x<i;x++) {
				int cont=0;
				for(int j=0;j<t.length();j++) {
					if(t.charAt(j)==s.charAt(j+x)) {
						cont++;
					}
				}
				ans=Math.max(cont, ans);
			}
			out.append(t.length()-ans+"");
		}
		
		out.flush();
		in.close();
		out.close();
	}
	public static int mcm(long num1,long num2) {
		int mcm=1;
		int i=2;
		while(i <= num1 || i <= num2)
        {
            if(num1%i==0 || num2%i==0)
            {
            mcm=mcm*i;
            if(num1%i==0) num1=num1/i;
            if(num2%i==0) num2=num2/i;
            }
            else
                i=i+1;               
        }                       
		return mcm;
	}
	public static long MCD(long a, long b) {
	       if(b==0)
	           return a;
	       else
	           return MCD(b, a % b);
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
