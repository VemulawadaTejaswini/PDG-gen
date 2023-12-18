import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Main {
	public void exec() throws IOException {
		InputUtil input = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int x=0;
		int y=0;
		while(true){
			x = input.nextInt();
			y = input.nextInt();
			if(x==0 && y==0){
				break;
			}else if(x < y){
				out.print(x);
				out.print(" ");
				out.println(y);
			}else{
				out.print(y);
				out.print(" ");
				out.println(x);
			}
		}
		out.flush();
		input.close();
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
	private static final int BUFSIZ = 40000;
	
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
	
	//String Input Reader/Parser
	private void readBuf() throws IOException {
		if(ptr >= max && br.ready()) {
			max = br.read(buf);
			ptr = 0;
		}
	}
	//Number Input Reader/Parser
	private boolean isNum(char b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(char b) {return b=='-'; }
	private void next() throws IOException {ptr++; readBuf();}

	public int nextInt() throws IOException {return nextInt(new int[1])[0];}
	public int[] nextInt(int[] result) throws IOException {
		readBuf();
		for(int i=0; i<result.length; i++) {
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
			result[i] = sign * res;
		}
		return result;
	}
	
	//Close 
	public void close() throws IOException {
		if(!this.in.equals(System.in)) 
			this.in.close();
	}

}