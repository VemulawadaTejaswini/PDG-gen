
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
	static HashMap<String, Integer> map = new HashMap<String,Integer>();
	static ArrayList<HashSet<String>> set = new ArrayList<HashSet<String>>();
	static int[] vx = new int[] {0,1,0,-1};
	static int[] vy = new int[] {-1,0,1,0};
	public static void main(String[] args) {
		int d = sc.nextInt();
		for(int i = 0; i < d; i++) {
			int n = sc.nextInt();
			char[][] map = new char[n][n];
			int y = n-1;
			int x = 0;
			int[] vy = new int[] {-1,0,1,0};
			int[] vx = new int[] {0,1,0,-1};
			
			int[] cvy = new int[] { 1, 0,-1, 0, 1, 1,-1,-1};
			int[] cvx = new int[] { 0, 1, 0,-1, 1,-1, 1,-1};
			int p = 0;
			
			for(int j = 0; j < n; j++) {
				Arrays.fill(map[j], ' ');
			}
			IN:while(true) {
				map[y][x] = '#';
				
				y += vy[p%4];
				x += vx[p%4];
				if(y < 0 || x < 0 || y >= n || x >= n) {
					y -= vy[p%4];
					x -= vx[p%4];
					
					p++;
					
					y += vy[p%4];
					x += vx[p%4];
					
					if(y < 0 || x < 0 || y >= n || x >= n) break IN;
					int count = 0;
					for(int j = 0; j < 8; j++) {
						if(checkR(y+cvy[j],x+cvx[j],n) && map[y+cvy[j]][x+cvx[j]] == '#') {
							count++;
						}
					}
					
					if(count <= 2) {
						map[y][x] = '#';
						continue IN;
					}
					
				}
				
				int count = 0;
				for(int j = 0; j < 8; j++) {
					if(checkR(y+cvy[j],x+cvx[j],n) && map[y+cvy[j]][x+cvx[j]] == '#') {
						count++;
					}
				}
				
				if(count <= 2) {
					map[y][x] = '#';
					continue IN;
				}
				else {
					y -= vy[p%4];
					x -= vx[p%4];
					
					p++;
					
					y += vy[p%4];
					x += vx[p%4];
					
					if(y < 0 || x < 0 || y >= n || x >= n) break IN;
					count = 0;
					for(int j = 0; j < 8; j++) {
						if(checkR(y+cvy[j],x+cvx[j],n) && map[y+cvy[j]][x+cvx[j]] == '#') {
							count++;
						}
					}
					
					if(count <= 2) {
						map[y][x] = '#';
						continue IN;
					}
				}

				
				break IN;
			}
			for(int j = 0; j < n; j++) {
				out.println(String.valueOf(map[j]));
				
			}
			if(i != n-1) {
				out.println();
			}
		}
		out.flush();
	}
	
	static boolean checkR(int y, int x,int n) {
		if(y < 0 || x < 0 || y >= n || x >= n) return false;
		return true;
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