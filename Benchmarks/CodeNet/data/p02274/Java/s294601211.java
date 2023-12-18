import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Main {
	public static void main(String[] args) throws IOException {
		new Main().exec();
	}
	
	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		
		int n = in.nextInt();
		int[] A = in.nextInt(new int[n]);
		for(int a : A) {
			Node.addNode(a);
		}
		out.println(Node.invCount);
		out.flush();
	}
	
	
}

class Node {
	public static int invCount = 0;
	public static Node root = null;

	public static void addNode(int value) {
		Node node = new Node(value);
		if(root == null) {
			root = node;
		} else {
			root.addNode(node);
		}
	}
	
	Node smaller = null;
	Node larger = null;
	int largerCount = 0;
	int value;
	
	private Node(int value){
		this.value= value;
	}
	
	public void addNode(Node newNode) {
		if(newNode.value < value) {
			Node.invCount += largerCount + 1;
			if(smaller == null){
				smaller = newNode;
			}else{
				smaller.addNode(newNode);
			}
		}else{
			largerCount++;
			if(larger == null) {
				larger = newNode;
			}else{
				larger.addNode(newNode);
			}
		}
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