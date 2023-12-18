import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	static final long MOD = 1000000007;
	static Node[] node;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		node = new Node[N];
		for(int i = 0; i < N; i++) {
			node[i] = new Node();
			char[] in = sc.next().toCharArray();
			if(in[0] == 'E') {
				node[i].isE = true;
			}
			if(in[0] == 'A') {
				node[i].isA = true;
			}
			if(in[0] == 'R') {
				node[i].isR = true;
			}
			if(in.length == 2) {
				node[i].isO = true;
			}
		}
		for(int i = 0; i < N-1; i++) {
			int s = sc.nextInt()-1;
			int t = sc.nextInt()-1;
			node[s].child.add(t);
		}
		long ans = dfs(0);
		System.out.println(ans);
	}
	static long dfs(int id) {
		Node now = node[id];
		long ret = 0;
		if(now.isE) {
			ret = 1;
			for(int i = 0; i < now.child.size(); i++) {
				ret = (dfs(now.child.get(i)) * ret) % MOD;
			}
			if(now.isO) ret = (ret + 1) % MOD;
		}
		if(now.isA) {
			if(now.isO) {
				ret = 1;
			}
			for(int i = 0; i < now.child.size(); i++) {
				ret = (dfs(now.child.get(i)) + ret) % MOD;
			}
		}
		if(now.isR) {
			long[] list = new long[now.child.size()];
			
			for(int i = 0; i < now.child.size(); i++) {
				list[i] = dfs(now.child.get(i));
			}
			long nn = (list[0]+1);
			for(int i = 1; i < list.length; i++) {
				nn = ((list[i]+1) * nn) % MOD;
			}
			if(!now.isO) nn--;
			ret = nn;
		}
		return ret;
	}
	static class Node {
		boolean isE;
		boolean isA;
		boolean isR;
		boolean isO;
		ArrayList<Integer> child = new ArrayList<Integer>();
	}
	
}

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
    	return (int)nextLong();
    }
}