
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		IN:while(true) {
			int n = (int)sc.nextLong();
			if(n == 0) break;
			int m = (int)sc.nextLong();
			int g = (int)sc.nextLong();
			int d = (int)sc.nextLong();
			char[][] x = new char[d][n];
			for(int i = 0; i < d; i++) {
				x[i] = sc.next().toCharArray();
			}
			
			for(int i = 0; i < d+1; i++) {
				if(i == 0) {
					if(solv(x,m,g)) {
						out.println("0");
						continue IN;
					}
				}
				else
				for(int j = 0; j < n-1; j++) {
					if(x[i-1][j] == '1') continue;
					if(j-1 >= 0 && x[i-1][j-1] == '1') continue;
					if(j+1 < n-1 && x[i-1][j+1] == '1') continue;
					x[i-1][j] = '1';
					if(solv(x,m,g)) {
						out.println(i + " " + (j+1));
						continue IN;
					}
					x[i-1][j] = '0';
				}
			}
			out.println("1");
		}
		
		out.flush();
	}
	
	static boolean solv(char[][] a, int s, int g) {
		int nowpx = s-1;
		
		for(int i = 0; i < a.length; i++) {
			if(nowpx - 1 >= 0 && a[i][nowpx - 1] == '1')  {
				if(a[i][nowpx - 1] == '1') {
					nowpx = nowpx-1;
				}
			}
			else if(nowpx < a[i].length && a[i][nowpx] == '1') {
				nowpx = nowpx+1;
			}
		}
		if(nowpx == g-1) return true;
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
    

}

class Point {
	Double x;
	Double y;
	Point(double a, double b) {
		x = a;
		y = b;
	}
}