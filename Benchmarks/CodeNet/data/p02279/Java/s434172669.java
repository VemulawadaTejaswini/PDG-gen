import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;


public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().exec();
	}
	
	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		int[][] tree = new int[n][];
		int[] parent = new int[n];
		int[] depth = new int[n];
		int[] buf = new int[n];
		Arrays.fill(parent, -1);
		Arrays.fill(depth, -1);
		
		for(int i=0; i<n; i++){
			int parentId = in.nextInt();
			int childNum = in.nextInt();
			if(childNum > 0) {
				tree[parentId] = in.nextInt(new int[childNum]);
				for(int childId: tree[parentId])
					parent[childId] = parentId;
			}
		}
		
		int rootId = 0;
		while(parent[rootId] != -1)
			rootId = parent[rootId];
		buf[0]=rootId;
		setDepth(tree,depth,parent,buf,0,1,0);
		
		for(int i=0; i<n; i++) {
			out.print("node ");
			out.print(i);
			out.print(": parent = ");
			out.print(parent[i]);
			out.print(", depth = ");
			out.print(depth[i]);
			out.print(", ");
			if(parent[i] == -1)
				out.print("root, [");
			else if(tree[i] == null)
				out.print("leaf, [");
			else out.print("internal node, [");
			if(tree[i] != null) {
				for(int j=0; j<tree[i].length; j++) {
					if(j>0)
						out.print(", ");
					out.print(tree[i][j]);
				}
			}
			out.println("]");
		}
		out.flush();
	}
	
	private void setDepth(int[][] tree, int[] depth, int[] parent, int[] buf, int str, int end, int d) {
		boolean loop=true;
		int bufptr = end;
		while(loop){
			loop=false;
			for(int i=str; i<end; i++){
				int id = buf[i];
				depth[id] = d;
				if(tree[id] != null) {
					loop=true;
					for(int childId: tree[id])
						buf[bufptr++] = childId;
				}
			}
			d++;
			str = end;
			end = bufptr;
		}
	}
	
}

class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 100000;
	
	//Fields
	protected InputStream in;
	private byte[] buf = null;
	private int ptr = 0;
	private int max = -1;
	private DataInputStream dis = null;
	//Constructors
	public InputUtil() {this(System.in,BUFSIZ);}
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {dis = new DataInputStream(this.in = in);}
	protected void initBuf(int bufsiz) {buf = new byte[bufsiz];}
	
	//buffer operation
	private void next() throws IOException {ptr++; readBuf();}
	private void readBuf() throws IOException {
		if(ptr >= max && dis.available()>0) {
			if(max>0) Arrays.fill(buf,0,max,(byte)0);
			max = dis.read(buf);
			ptr = 0;
		}
	}
	
	//Number Input Reader/Parser
	private boolean isNum(byte b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(byte b) {return b=='-'; }

	private int _nextInt() throws IOException {
		int sign = 1;
		int res = 0;
		byte c;
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