import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws IOException {
		long l = System.currentTimeMillis();
		new Main().exec();
		long l2 = System.currentTimeMillis();
/*
		System.out.println((l2-l)+"msec");
//*/		
	}
	
	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		OutputUtil out = new OutputUtil();
		int n = in.nextInt();
		int[] A = in.nextInt(new int[n]);
		int[] B = new int[n];
		countingSort(A,B,10000);
		out.outputDivSpace(B);
	}
	
	private void countingSort(int[] A, int[] B, int k) {
		int[] C = new int[k+1];
		int n = A.length;
		Arrays.fill(C, 0);
		int max = 0;
		for (int i=0; i<n; i++) {
			C[A[i]]++;
			max = (max<A[i]) ? A[i] : max;
		}
		
		for(int i=1; i<=max; i++) {
			C[i] += C[i-1];
		}
		
		for(int i=n-1; i>=0; i--) {
			B[--C[A[i]]] = A[i];
		}
		
		
	}
}

class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 12000000;
	
	//Fields
	protected InputStream in;
	private char[] buf = null;
	private int ptr = 0;
	private int max = -1;
	private BufferedReader br = null;
	
	//Constructors
	public InputUtil() {this(System.in,BUFSIZ);}
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {br = new BufferedReader(new InputStreamReader(this.in = in));}
	protected void initBuf(int bufsiz) {buf = new char[bufsiz];}
	
	//buffer operation
	private boolean next() throws IOException {ptr++; return readBuf();}
	private boolean readBuf() throws IOException {
		if(ptr >= max && br.ready()) {
			max = br.read(buf);
			ptr = 0;
		}
		return (max>0);
	}
	
	//Number Input Reader/Parser
	private boolean isNum(char b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(char b) {return b=='-'; }

	private int _nextInt() throws IOException {
		int sign = 1;
		int res = 0;
		char c = buf[ptr];
		while (!isNum(c=buf[ptr]) && !isMinus(c)) 
			if(!next()) throw new IllegalStateException();
		if (isMinus(c)) {
			sign = -1;
			if(!next()) throw new IllegalStateException();
		}
		while (isNum(c=buf[ptr])) {
			res *= 10;
			res += c - '0' ;
			if(!next())
				break;
		}
		next();
		return sign * res;
	}
	
	public int nextInt() throws IOException {
		if(!readBuf()) throw new IllegalStateException();
		return _nextInt();
	}

	public int[] nextInt(int[] result) throws IOException {
		if(!readBuf()) throw new IllegalStateException();
		for(int i=0; i<result.length; i++) {
			result[i] = _nextInt();
		}
		return result;
	}
	
	//Close 
	public void close() throws IOException {
		if(!this.in.equals(System.in)) 
			this.in.close();
	}

}

class OutputUtil {
	PrintWriter out = new PrintWriter(System.out);

	public void outputDivSpace(int[] a) {
		output(a,0,a.length," ");
	}

	public void output(int[] a, int off, int len, String delim) {
		out.print(a[off]);
		for(int i=off+1; i<len; i++){
			out.print(delim);
			out.print(a[i]);
		}
		out.println("");
		out.flush();
	}
}