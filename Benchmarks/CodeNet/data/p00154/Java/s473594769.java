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
    		int m = sc.nextInt();
    		if(m == 0) break;
    		int[] a = new int[m];
    		int[] b = new int[m];
    		for(int i = 0; i < m; i++) {
    			a[i] = sc.nextInt();
    			b[i] = sc.nextInt();
    		}
    		
    		int[] dp = new int[1001];
    		for(int i = 0; i < m; i++) {
    			int[] pre = Arrays.copyOf(dp, dp.length);
    			for(int j = 0; j < 1001; j++) {
    				if(pre[j] != 0) {
    					for(int k = 0; k < b[i]; k++) {
    						if(j + a[i] * (k+1) <= 1000) {
    							dp[j + a[i] * (k+1)] += pre[j];
    						}
    					}
    				}
    			}
    			for(int j = 0; j < b[i]; j++) {
    				if(a[i]*(j+1) < 1001) {
    					dp[a[i] * (j+1)]++;
    				}
    			}
    		}
    		
    		int g = sc.nextInt();
    		for(int i = 0; i < g; i++) {
    			int n = sc.nextInt();
    			out.println(dp[n]);
    		}
    	}
    	out.flush();
    }
    
    static int comb(int a, int b) {
    	int s1 = a;
    	int s2 = 1;
    	for(int i = 1; i < b; i++) {
    		s1 *= a - i;
    		s2 *= i+1;
    	}
    	return s1 / s2;
    }
         
 
}

class Data {
	int id;
	int score;
	Data(int a, int b) {
		id = a;
		score = b;
	}
}

class MyComp implements Comparator<Data>{

	@Override
	public int compare(Data o1, Data o2) {
		if(o1.score < o2.score) {
			return 1;
		}
		else if(o1.score > o2.score) {
			return -1;
		}
		else if(o1.id < o2.id) {
			return -1;
		}
		return 1;
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