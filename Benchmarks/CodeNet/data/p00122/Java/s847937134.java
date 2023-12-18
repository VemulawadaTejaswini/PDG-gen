
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
	static int INF = 2 << 26;
	static int sx;
	static int sy;
	
	static int n;
	static int[] xlist;
	static int[] ylist;
	public static void main(String[] args) {
		while(true) {
			sx = sc.nextInt();
			sy = sc.nextInt();
			if(sy == 0 && sx == 0) break;
			n = sc.nextInt();
			xlist = new int[n];
			ylist = new int[n];
			for(int i = 0; i < n; i++) {
				xlist[i] = sc.nextInt();
				ylist[i] = sc.nextInt();
			}
			
			boolean ans = solv();
			if(ans) {
				out.println("OK");
			}
			else {
				out.println("NA");
			}
			
			
		}
		out.flush();
	}
	static ArrayDeque<Data> queue = new ArrayDeque<Data>();
	static boolean ans;
	static boolean solv() {
		ans = false;
		queue.isEmpty();
		
		queue.addLast(new Data(sy,sx,-1));
		
		while(!queue.isEmpty()) {
			bfs(queue.poll());
		}
		
		return ans;
	}
	
	static void bfs(Data a) {
		if(a.n == n) {
			ans = true;
			return;
		}
		if(!rCheck(a.y,a.x)) return;
		if(a.n == -1) {
			queue.addLast(new Data(a.y,a.x-2,a.n+1));
			queue.addLast(new Data(a.y,a.x+2,a.n+1));
			queue.addLast(new Data(a.y+2,a.x,a.n+1));
			queue.addLast(new Data(a.y-2,a.x,a.n+1));
			
			queue.addLast(new Data(a.y+2,a.x+1,a.n+1));
			queue.addLast(new Data(a.y+2,a.x-1,a.n+1));
			queue.addLast(new Data(a.y+1,a.x-2,a.n+1));
			queue.addLast(new Data(a.y+1,a.x+2,a.n+1));
			queue.addLast(new Data(a.y-1,a.x-2,a.n+1));
			queue.addLast(new Data(a.y-1,a.x+2,a.n+1));
			queue.addLast(new Data(a.y-2,a.x+1,a.n+1));
			queue.addLast(new Data(a.y-2,a.x-1,a.n+1));
			
			return;
		}
		
		if(!lCheck(a.y,a.x,a.n)) return;
		queue.addLast(new Data(a.y,a.x-2,a.n+1));
		queue.addLast(new Data(a.y,a.x+2,a.n+1));
		queue.addLast(new Data(a.y+2,a.x,a.n+1));
		queue.addLast(new Data(a.y-2,a.x,a.n+1));
		queue.addLast(new Data(a.y+2,a.x+1,a.n+1));
		queue.addLast(new Data(a.y+2,a.x-1,a.n+1));
		queue.addLast(new Data(a.y+1,a.x-2,a.n+1));
		queue.addLast(new Data(a.y+1,a.x+2,a.n+1));
		queue.addLast(new Data(a.y-1,a.x-2,a.n+1));
		queue.addLast(new Data(a.y-1,a.x+2,a.n+1));
		queue.addLast(new Data(a.y-2,a.x+1,a.n+1));
		queue.addLast(new Data(a.y-2,a.x-1,a.n+1));
	}
	
	static class Data {
		int y;
		int x;
		int n;
		
		Data(int a, int b, int c) {
			y = a;
			x = b;
			n = c;
		}
	}
	
	static boolean rCheck(int y, int x) {
		if(y > 9 || x > 9 || x < 0 || y < 0) return false;
		return true;
	}
	
	static boolean lCheck(int y, int x, int n) {
		int yr = ylist[n];
		int xr = xlist[n];
		
		if(y >= yr - 1 && y <= yr + 1 && x >= xr - 1 && x <= xr +1) {
			return true;
		}
		return false;
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