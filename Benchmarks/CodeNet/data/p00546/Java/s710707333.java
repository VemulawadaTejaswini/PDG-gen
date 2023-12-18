import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	static final int INF = 2 << 28;
	static final long INF_L = 2L << 60;
	static final int  MOD = 1000000007;
	static final long MOD_L = 1000000007;
	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int S = sc.nextInt();
		
		int P = sc.nextInt();
		int Q = sc.nextInt();
		
		Node[] node = new Node[N];
		for(int i = 0; i < N; i++) {
			node[i] = new Node(i);
		}
		int[] C = new int[K];
		for(int i = 0; i < K; i++) {
			C[i] = sc.nextInt()-1;
		}
		for(int i = 0; i < N; i++) {
			node[i].S = INF;
		}
		for(int i = 0; i < M; i++) {
			int f = sc.nextInt()-1;
			int t = sc.nextInt()-1;
			node[f].next.add(t);
			node[t].next.add(f);
		}
		ArrayDeque<Data> q = new ArrayDeque<Data>();
		for(int i = 0; i < K; i++) {
			q.add(new Data(C[i],0));
		}
		while(!q.isEmpty()) {
			Data tmp = q.pollFirst();
			if(node[tmp.id].S <= tmp.c) continue;
			node[tmp.id].S = tmp.c;
			if(tmp.c == S) continue;
			for(int i = 0; i < node[tmp.id].next.size(); i++) {
				int next = node[tmp.id].next.get(i);
				if(node[next].S <= tmp.c+1) continue;
				q.addLast(new Data(next,tmp.c+1));
			}
		}
		ArrayDeque<Data> q2 = new ArrayDeque<Data>();
		q2.add(new Data(0,0));
		node[N-1].S = INF;
		while(!q2.isEmpty()) {
			Data tmp = q2.pollFirst();
			if(node[tmp.id].max <= tmp.c) continue;
			node[tmp.id].max = tmp.c;
			ArrayList<Integer> next = node[tmp.id].next;
			for(int i = 0; i < next.size(); i++) {
				if(node[next.get(i)].S == INF) {
					if(node[next.get(i)].max <= node[tmp.id].max + P) continue;
					q2.add(new Data(next.get(i),node[tmp.id].max + P));
				}
				else if(node[next.get(i)].S != 0) {
					if(node[next.get(i)].max <= node[tmp.id].max + Q) continue;
					q2.add(new Data(next.get(i),node[tmp.id].max + Q));
				}
			}
		}
		
		System.out.println(node[N-1].max - P);
		
		
		
		
		
		
		
	}
	static class Data {
		int id;
		long c;
		Data(int id, long c) {
			this.id = id;
			this.c = c;
		}
	}
	
	static class Node {
		int id;
		long S;
		long max;
		Node(int a) {
			id = a;
			S = -1;
			max = INF_L;
		}
		ArrayList<Integer> next = new ArrayList<Integer>();
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