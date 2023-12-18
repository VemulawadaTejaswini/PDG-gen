
import java.awt.geom.Point2D;
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;



public class Main {

	static PrintWriter out = new PrintWriter(System.out);
	static FastScanner sc = new FastScanner();
	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			char[] in = sc.next().toCharArray();
			if(in[0] == '0') break;
			int ans = bfs(in);
			if(ans == 10) {
				out.println("NA");
			}
			else
			out.println(ans);
		}
		out.flush();
	}
	static ArrayDeque<Data> queue = new ArrayDeque<Data>();
	static HashMap<String, Integer> map = new HashMap<String, Integer>();
	static int min = 10;
	public static int bfs(char[] a) {
		min = 10;
		map.clear();
		queue.clear();
		queue.offer(new Data(a,0));
		while(!queue.isEmpty()) {
			solv(queue.poll());
		}
		return min;
	}
	
	public static void solv(Data a) {
		char[] t = a.data;
		boolean c = true;
		if(a.count >= min) return;
		if(map.containsKey(String.valueOf(t)) && map.get(String.valueOf(t)) < a.count) {
			return;
		}
		map.put(String.valueOf(t), a.count);
		for(int i = 0; i < t.length-1; i++) {
			if(t[i] != t[i+1]) {
				c = false;
				char xx = check(t[i],t[i+1]);
				char[] cpy = Arrays.copyOf(t, t.length);
				cpy[i] = xx;
				cpy[i+1] = xx;
				queue.addLast(new Data(cpy,a.count+1));
			}
		}
		if(min > a.count && c) {
			min = a.count;
			return;
		}
	}
	
	public static char check(char a, char b) {
		boolean[] list = new boolean[3];
		if(a == 'r' || b == 'r') {
			list[0] = true;
		}
		if(a == 'g' || b == 'g') {
			list[1] = true;
		}
		if(a == 'b' || b == 'b') {
			list[2] = true;
		}
		
		if(!list[0]) return 'r';
		if(!list[1]) return 'g';
		return 'b';
	}
	
	

}

class Data {
	char[] data;
	int    count;
	Data(char[] a, int b) {
		data = a;
		count = b;
	}
	
}
//------------------------------//
//-----------//
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