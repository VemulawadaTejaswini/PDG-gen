import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StreamTokenizer;
import java.util.InputMismatchException;


public class Main {

	static Scanner sc;
	static Printer pr;
	
	public static Node[] nodes;
	public static int tree;

	public static void main(String[] args) {
		sc = new Scanner(System.in); 
		pr = new Printer(System.out);

		int n = sc.nextInt();
		nodes = new Node[n];
		
    	for (int i = 0; i < n; i++) {
    		int id = sc.nextInt();
    		int k = sc.nextInt();
    		int[] child;
    		if (k > 0) {
    			child = new int[k]; 
    		} else {
    			child = null;
    		}
    		for (int j = 0; j < k; j++) {
    			child[j] = sc.nextInt();
    		}
    		nodes[id] = new Node(id, child);
    	}

    	addNode(0, -1, 0); // id = 0, ROOT, depth = 0
    	
    	pr.close();
        sc.close();
	}
	
	private static void addNode(int id, int parent, int depth) {
		nodes[id].parent = parent;
		if (parent == -1) {
			nodes[id].type = NodeType.ROOT;
		} else {
			if (nodes[id].children == null) {
				nodes[id].type = NodeType.LEAF;
			} else {
				nodes[id].type = NodeType.INTERNAL_NODE;
			}
		}
		nodes[id].depth = depth;

		printNode(id);
		
		if (nodes[id].children == null) {
			return;
		} else {
			for (int i = 0; i < nodes[id].children.length; i++) {
				addNode(nodes[id].children[i], id, depth + 1);
			}
		}
	}

	private static void printNode(int id) {
		pr.print("node ");
		pr.print(id);
		pr.print(": parent = ");
		pr.print(nodes[id].parent);
		pr.print(", depth = ");
		pr.print(nodes[id].depth);
		pr.print(", ");
		String type;
		switch (nodes[id].type) {
		case INTERNAL_NODE:
			type = "internal node";
			break;
		case LEAF:
			type = "leaf";
			break;
		case ROOT:
			type = "root";
			break;
		default:
			type = null;
		}
		pr.print(type);
		pr.print(", [");
		if (nodes[id].children == null) {
		} else {
			for (int i = 0; i < nodes[id].children.length; i++) {
				pr.print(nodes[id].children[i]);
				if (i + 1 < nodes[id].children.length) {
					pr.print(", ");
				}
			}
		}
		pr.println("]");
	}

	private static enum NodeType {
		ROOT, INTERNAL_NODE, LEAF;
	}
	
	private static class Node {
		public int id;
		public int parent;
		public int depth;
		public NodeType type;
		public int[] children;
	
		public Node(int id, int[] children) {
			this.id = id;
			this.children = children;
		}
	}


	private static class Scanner {
		InputStreamReader isr;
		BufferedReader br;
		StreamTokenizer st;
		
		Scanner (InputStream in) {
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			st = new StreamTokenizer(br);
		}
		
		String next() throws RuntimeException  {
			try {
				if (st.nextToken() != StreamTokenizer.TT_WORD) {
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}
			
			return st.sval;
		}
		
		int nextInt() throws RuntimeException {
			try {
				if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
					throw new InputMismatchException();
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}
			
			return (int)st.nval;
		}

		void close() {
		}
	}
	
	private static class Printer {
		PrintStream out;
		StringBuffer strbuf;
		int bufSize;
		final String CR;

		Printer(PrintStream out) {
			this.out = out;
			strbuf = new StringBuffer();
			bufSize = 64 * 1024;
			CR = System.getProperty("line.separator");
		}

		void println(String str) {
			strbuf.append(str);
			strbuf.append(CR);
			checkStringBuffer();
		}

		void print(String str) {
			strbuf.append(str);
			checkStringBuffer();
		}

		void println(int n) {
			strbuf.append(n);
			strbuf.append(CR);
			checkStringBuffer();
		}

		void print(int n) {
			strbuf.append(n);
			checkStringBuffer();
		}

		void print(char c) {
			strbuf.append(c);
			checkStringBuffer();
		}

		void printArray(int[] array) {
			for (int i = 0; i < array.length; i++) {
				checkStringBuffer();
				strbuf.append(array[i]);
				strbuf.append(" ");
			}
			strbuf.delete(strbuf.length() - 1, strbuf.length());
			strbuf.append(CR);
		}

		void close() {
			flashStringBuffer();
		}
		
		private void flashStringBuffer() {
			if (strbuf.length() > 0) {
				out.print(strbuf);
				strbuf.setLength(0);
			}
		}
		
		private void checkStringBuffer() {
			if (strbuf.length() > bufSize) {
				out.print(strbuf);
				strbuf.setLength(0);
			}
		}
	}
}