import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Main {
	
    public static void main(String[] args) throws IOException {
//    	long l = System.currentTimeMillis();
        new Main().exec();
//    	long l2 = System.currentTimeMillis();
//    	System.out.println(l2 - l);
    }
    
    public void exec() throws IOException {
        InputUtil in = new InputUtil();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] S = in.nextInt(new int[n]);
        int compare = mergeSort(S,0,n);
        out.print(S[0]);
        for(int i=1; i<n; i++){
        	out.print(" ");
        	out.print(S[i]);
        }
        out.println("");
        out.println(compare);
        out.flush();
    }
    
    int[] L = new int[250001];
    int[] R = new int[250001];
    
    private int merge(int[] A, int left, int mid, int right) {
    	int compare=0;
    	int n1= mid - left;
    	int n2 = right - mid;
    	System.arraycopy(A, left, L, 0, n1);
    	L[n1] = Integer.MAX_VALUE;
    	System.arraycopy(A, mid, R, 0, n2);
    	R[n2] = Integer.MAX_VALUE;
    	int i=0, j=0;
    	for(int k=left; k<right; k++) {
    		if (L[i] <= R[j]) {
    			A[k] = L[i];
    			i=i+1;
    		}else{
    			A[k] = R[j];
    			j=j+1;
    		}
    		compare++;
    	}
    	return compare;
    }
    private int mergeSort(int[] A, int left, int right) {
    	int compare = 0;
    	if(left+1 < right) {
    		int mid = (left + right)/2;
    		compare += mergeSort(A, left, mid);
    		compare += mergeSort(A, mid, right);
    		compare += merge(A, left, mid, right);
    	}
    	return compare;
    }
}

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