
import java.awt.geom.Point2D;
import java.io.*;
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

import javax.xml.crypto.Data;
public class Main {

	static PrintWriter out = new PrintWriter(System.out);
	static FastScanner sc = new FastScanner();
	static Scanner stdIn = new Scanner(System.in);
	static int count = 0;
	

	static int cost[][] = new int[22][22];
	static int d[] = new int[22];
	static boolean used[] = new boolean[22];
	static int V;
	static int INF = 2 << 28;
	
	public static void main(String[] args) {
		V = sc.nextInt();
		int m = sc.nextInt();
		for(int i = 0; i < 21; i++) {
			Arrays.fill(cost[i], INF);
		}
		for(int i = 0; i < m; i++) {
			String[] tmp = sc.next().split(",");
			int[] xx = new int[4];
			for(int j = 0; j < 4; j++) {
				xx[j] = Integer.parseInt(tmp[j]);
			}
			
			cost[xx[0]-1][xx[1]-1] = xx[2];
			cost[xx[1]-1][xx[0]-1] = xx[3];
		}
		String[] tmp = sc.next().split(",");
		int[] xx = new int[4];
		for(int j = 0; j < 4; j++) {
			xx[j] = Integer.parseInt(tmp[j]);
		}
		
		dijkstra(xx[0]-1);
		int a1 = d[xx[1]-1];
		dijkstra(xx[1]-1);
		int a2 = d[xx[0]-1];
		out.println((xx[2] - a1 - a2 - xx[3]));
		
		out.flush();
	}
	
	static void dijkstra(int s) {
		Arrays.fill(d, INF);
		Arrays.fill(used, false);
		d[s] = 0;
		
		while(true) {
			int v = -1;
			
			for(int u = 0; u < V; u++) {
				if(!used[u] && ( v == -1 || d[u] < d[v])) v = u;
				
			}
			if( v == -1) break;
			used[v] = true;
			for(int u = 0; u < V; u++) {
				d[u] = Math.min(d[u],d[v] + cost[v][u]);
			}
		}

	}
	
	
	static class Pair {
		int first;
		int second;
		Pair(int a, int b) {
			first = a;
			second = b;
		}
	}
	
	static class Edge {
		int to;
		int cost;
		Edge(int a, int b) {
			to = a;
			cost = b;
		}
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