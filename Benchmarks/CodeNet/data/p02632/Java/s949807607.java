import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static BufferedReader reader;
	final static boolean MODE_DEBUG = false;
	static int[] read_line_int;
	static int read_line_int_ptr;
	static long[] read_line_long;
	static int read_line_long_ptr;
	static String[] read_line;
	static int read_line_ptr;
	
	final static int DIV = 1000000000+7;
	static int mypow25ptr = 0;
	static int[] mypow25 = new int[2*1000000];
	static int mypow26ptr = 0;
	static int[] mypow26 = new int[2*1000000];
	//static int myfactptr = 0;
	//static int[] myfact = new int[2*1000000];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		
		pre_factrials(2*1000000);
		
		int K = readInt();
		/*for(int i=0;i<K;i++) {
			print(i+"!="+fact(i));
			for(int j=0;j<K;j++) {
				print(i+"C"+j+"="+fermatComb(i,j));
			}
		}*/
		
		String S = readLine()[0];
		int L = S.length();
		long ans = 0;
		for(int slpos = L; slpos<=L+K; slpos++) {
			long t = pow26(L+K-slpos);
			t=(t*pow25(slpos-L))%DIV;
			t=(t*fastFermatComb(slpos-1,L-1))%DIV;
			ans=(ans+t)%DIV;
		}
		print(ans);
	}
	
	//functions here
	//note that all methods should be STATIC
	private static int pow25(int n) {
		n--;
		if(n<0) {return 1;}
		if(mypow25ptr<=n) {
			for(;mypow25ptr<=n;mypow25ptr++) {
				if(mypow25ptr==0) {mypow25[0]=25;continue;}
				mypow25[mypow25ptr]=(int)(((long)mypow25[mypow25ptr-1]*25)%DIV);
			}
		}
		return mypow25[n];
	}
	private static int pow26(int n) {
		n--;
		if(n<0) {return 1;}
		if(mypow26ptr<=n) {
			for(;mypow26ptr<=n;mypow26ptr++) {
				if(mypow26ptr==0) {mypow26[0]=26;continue;}
				mypow26[mypow26ptr]=(int)(((long)mypow26[mypow26ptr-1]*26)%DIV);
			}
		}
		return mypow26[n];
	}
	/*private static int fact(int n) {
		n--;
		if(n<0) {return 1;}
		if(myfactptr<=n) {
			for(;myfactptr<=n;myfactptr++) {
				if(myfactptr==0) {myfact[0]=1;continue;}
				myfact[myfactptr]=(int)(((long)myfact[myfactptr-1]*(myfactptr+1))%DIV);
			}
		}
		return myfact[n];
	}*/
	/*private static int comb(int a,int b) {
		if(a==0&&b==0) {return 1;}
		if(a<b||a<a) {return 0;}
		
		long tmp = fact(a-b);
		tmp=(tmp*fact(b))%DIV;
		tmp=(tmp*fact(a))%DIV;
		return (int)tmp;
	}*/
	static long fermatComb(long a, long b) {
        if (b > a - b)
            return fermatComb(a, a - b);
        long mul = 1; //分子
        long div = 1; //分母
        for (int i = 0; i < b; i++) {
            mul *= (a - i);
            mul %= DIV;
            div *= (i + 1);
            div %= DIV;
        }
        long ans = mul * modpow(div, DIV - 2) % DIV; //フェルマーの小定理を利用して掛け算で計算
        //print(a+"C"+b+"="+ans);
        return ans;
    }
	private static <T> int arraySearch(T needle, T[] heystack) {
		for(int i=0;i<heystack.length;i++) {
			if(needle.equals(heystack[i])) {
				return i;
			}
		}
		return -1;
	}
	private static int[] sort(int[] base) {
		int[] copy = array_copy(base);
		Arrays.sort(copy);
		return copy;
	}
	private static int[] array_copy(int[] base) {
		int[] copy = new int[base.length];
		for(int i=0;i<base.length;i++) {
			copy[i] = base[i];
		}
		return copy;
	}
	private static int[] asArray(ArrayList<Integer> ints) {
		int[] intlist = new int[ints.size()];
		for(int i=0;i<intlist.length;i++) {
			intlist[i] = ints.get(i);
		}
		return intlist;
	}
	private static int readInt() {
		if(read_line_int==null||read_line_int_ptr==read_line_int.length) {
			read_line_int = readLineInt();
			read_line_int_ptr=0;
		}
		return read_line_int[read_line_int_ptr++];
	}
	private static long readLong() {
		if(read_line_long==null||read_line_long_ptr==read_line_long.length) {
			read_line_long = readLineLong();
			read_line_long_ptr=0;
		}
		return read_line_long[read_line_long_ptr++];
	}
	private static String readString() {
		if(read_line==null||read_line_int_ptr==read_line.length) {
			read_line = readLine();
			read_line_ptr=0;
		}
		return read_line[read_line_ptr++];
	}
	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static int[] readLineInt(){
		try{
			String[] s = readLine();
			int[] ints = new int[s.length];
			for(int i=0;i<ints.length;i++) {
				ints[i] = Integer.parseInt(s[i]);
			}
			return ints;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static long[] readLineLong(){
		try{
			String[] s = readLine();
			long[] ints = new long[s.length];
			for(int i=0;i<ints.length;i++) {
				ints[i] = Long.parseLong(s[i]);
			}
			return ints;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static byte[] readLineByte(){
		try{
			String[] s = readLine();
			byte[] bytes = new byte[s.length];
			for(int i=0;i<bytes.length;i++) {
				bytes[i] = Byte.parseByte(s[i]);
			}
			return bytes;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static char[] readLineChar(){
		try{
			String[] s = readLine();
			char[] chars = new char[s.length];
			for(int i=0;i<chars.length;i++) {
				chars[i] = (char)Integer.parseInt(s[i]);
			}
			return chars;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
	private static void printd(Object o){
		if(MODE_DEBUG)System.err.println(o);
	}
	private static void printd(){
		if(MODE_DEBUG)System.err.println();
	}
	
	
	

	//Fast Fermat Combination
	    static long factorials[];
	    static long factorialDivs[];

	    static void pre_factrials(int n) {
	        factorials = new long[n + 1];
	        factorialDivs = new long[n + 1];//割算の結果を格納する配列
	        factorials[0] = 1;
	        for (int i = 0; i < n; i++) {
	            factorials[i + 1] = mul(i + 1, factorials[i]);
	        }
	        factorialDivs[n] = div(1, factorials[n]);//最初に1/(n!)を求める事で、1/(n-1)!からは掛け算で求める事ができる。
	        for (int i = n - 1; i >= 0; i--) {
	            factorialDivs[i] = mul(factorialDivs[i + 1], i + 1);
	        }
	    }

	    static long fastFermatComb(int a, int b) {
	        if (factorials.length == 0)
	            System.err.println("error : factorials has not been culculated!! do [pre_factorial] method");
	        long af = factorials[a];
	        long bf = factorialDivs[b];
	        long abf = factorialDivs[a - b];
	        long res = mul(mul(af, bf), abf);
	        return res;
	    }
	    //MOD culculations
	    static long plus(long x, long y) {
	        x %= DIV;
	        y %= DIV;
	        long res = (x + y) % DIV;
	        return res;
	    }

	    static long sub(long x, long y) {
	        x %= DIV;
	        y %= DIV;
	        long res = (x - y + DIV) % DIV;
	        return res;
	    }

	    static long mul(long x, long y) {
	        x %= DIV;
	        y %= DIV;
	        long res = x * y % DIV;
	        return res;
	    }

	    static long div(long x, long y) {
	        x %= DIV;
	        y %= DIV;
	        long res = x * modpow(y, DIV - 2) % DIV;
	        return res;
	    }

	    static long modpow(long a, long p) {
	        if (p == 0)
	            return 1;
	        if (p % 2 == 0) {
	            long halfP = p / 2;
	            long root = modpow(a, halfP);
	            return root * root % DIV;
	        } else
	            return a * modpow(a, p - 1) % DIV;
	    }
}


