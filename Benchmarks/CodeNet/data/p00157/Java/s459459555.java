
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
	static char[][] map;
	static ArrayList<Data> list = new ArrayList<Data>();
	public static void main(String[] args) {
		while(true) {
			list.clear();
			int n = sc.nextInt();
			if(n == 0) break;
			for(int i = 0; i < n; i++) {
				list.add(new Data(sc.nextInt(), sc.nextInt()));
			}
			int m = sc.nextInt();
			for(int i = 0; i < m; i++) {
				list.add(new Data(sc.nextInt(), sc.nextInt()));
			}
			
			Collections.sort(list,new Comp());
			
			int[] dp = new int[n + m];
			for(int i = 0; i < n+ m; i++) {
				dp[i] = 1;
			}
			for(int i = 1; i < n + m; i++) {
				if(list.get(i).h > list.get(i-1).h && list.get(i).r > list.get(i-1).r) {
					dp[i] = Math.max(dp[i], dp[i-1] + 1);
				}
				if(i > 1 && list.get(i).h > list.get(i-2).h && list.get(i).r > list.get(i-2).r && list.get(i-1).r == list.get(i-2).r) {
					dp[i] = Math.max(dp[i], dp[i-2] + 1);
				}
				
			}
			Arrays.sort(dp);
			out.println(dp[n + m-1]);
			
		}
		out.flush();
	}
	
	static class Comp implements Comparator<Data>{

		@Override
		public int compare(Data o1, Data o2) {
			return o1.r - o2.r;
		}
		
	}
	
	static class Data{
		int h;
		int r;
		Data(int a, int b) {
			h = a;
			r = b;
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