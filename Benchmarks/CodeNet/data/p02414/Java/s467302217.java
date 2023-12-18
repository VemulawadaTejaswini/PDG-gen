import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static final String EOL = System.getProperty("line.separator");
    public void exec() throws IOException {
    	InputUtil in = new InputUtil();
    	PrintWriter out = new PrintWriter(System.out);
    	int n = in.nextInt();
    	int m = in.nextInt();
    	int l = in.nextInt();
    	int[] A = in.nextInt(new int[n*m]);
    	int[] B = in.nextInt(new int[m*l]);
    	long[] C = new long[n*l];

    	for(int i=0; i<n; i++) {
        	for(int j=0; j<l; j++) {
        		for( int k=0; k<m; k++) {
        			C[i*l+j] += A[i*m+k] * B[k*l+j];
        		}
        	}
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i<n; i++) {
        	for(int j=0; j<l; j++) {
        		if(j > 0)
        			sb.append(" ");
        		sb.append(C[i*l+j]);
        	}
        	sb.append(EOL);
    	}
        
    	out.print(sb.toString());
        out.flush();
    }
 
    public static void main(String[] args) throws IOException {
    	new Main().exec();
    }
}


/**
 * --------------------------------------------------
 * Input Utility
 * --------------------------------------------------
 */
class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 50000;
	
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
	private void next() throws IOException {ptr++; readBuf();}
	private void readBuf() throws IOException {
		if(ptr >= max && br.ready()) {
			max = br.read(buf);
			ptr = 0;
		}
	}
	
	//Number Input Reader/Parser
	private boolean isNum(char b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(char b) {return b=='-'; }

	private int _nextInt() throws IOException {
		int sign = 1;
		int res = 0;
		char c;
		while (!isNum(c=buf[ptr]) && !isMinus(c)) 
			next();
		if (isMinus(buf[ptr])) {
			sign = -1;
			next();
		}
		while (isNum(c=buf[ptr])) {
			res *= 10;
			res += c - '0' ;
			next();
		}
		next();
		return sign * res;
	}
	
	public int nextInt() throws IOException {
		readBuf();
		return _nextInt();
	}

	public int[] nextInt(int[] result) throws IOException {
		readBuf();
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