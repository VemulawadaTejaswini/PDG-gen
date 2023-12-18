import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
 
 
 
public class Main {
	static int cnt;
	static PrintWriter out = new PrintWriter(System.out);
	static FastScanner sc = new FastScanner();
	static Scanner stdIn = new Scanner(System.in);
	public static void main (String[] args) {
		int n = sc.nextInt();
		Node[] nodes = new Node[201];
		Edge[] edges = new Edge[n];
		for(int i = 0; i < 201; i++) {
			nodes[i] = new Node();
		}
		for(int i = 0; i < n; i++) {
			int u = sc.nextInt();
			boolean l = sc.next().charAt(0)=='l'?true:false;
			int d = sc.nextInt() + 100;
			
			if(l) {
				Edge tmp = new Edge(u,false);
				edges[i] = tmp;
				nodes[d].next.add(tmp);
			}
			else {
				Edge tmp = new Edge(d,false);
				edges[i] = tmp;
				nodes[u].next.add(tmp);
			}
		}
		boolean ans = false;
		for(int i = 0; i < 201; i++) {
			ans |= dfs(nodes,i,true,i);
			for(int j = 0; j < n; j++) {
				edges[j].use = false;
			}
		}
		System.out.println((ans?"1":"0"));
	}
	static boolean dfs(Node[] list, int now, boolean first, int start) {
		if(!first && now == start) return true;
		boolean ret = false;
		for(int i = 0; i < list[now].next.size(); i++) {
			if(list[now].next.get(i).use) continue;
			list[now].next.get(i).use = true;
			ret |= dfs(list,list[now].next.get(i).to,false,start);
		}
		return ret;
	}
	static class Node {
		ArrayList<Edge> next = new ArrayList<Edge>();
		
	}
	static class Edge {
		int to;
		boolean use;
		Edge(int to, boolean use) {
			this.to = to;
			this.use = use;
		}
	}
}
 
 
//------------------------------//
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    
    public int nextInt() {
         if (!hasNext()) throw new NoSuchElementException();
         int n = 0;
         boolean minus = false;
         int b = readByte();
         if (b == '-') {
             minus = true;
             b = readByte();
         }
         if (b < '0' || '9' < b) {
             throw new NumberFormatException();
         }
         while(true){
             if ('0' <= b && b <= '9') {
                 n *= 10;
                 n += b - '0';
             }else if(b == -1 || !isPrintableChar(b)){
                 return minus ? -n : n;
             }else{
                 throw new NumberFormatException();
             }
             b = readByte();
         }
    }
    
    public double nextDouble() {
        return Double.parseDouble(next());
    }
    
 
}