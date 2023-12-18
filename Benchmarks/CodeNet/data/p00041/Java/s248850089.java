
import java.awt.geom.Point2D;
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {
	static boolean[] ans;
	static int[][] pass;
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		
		FastScanner sc = new FastScanner();
		
		// ((a.b).(c.d))
		//(((a.b).c).d)
		//((a.(b.c)).d)
		
		char[] op = new char[]{'+','-','*'};
		int ans = 10;
		IN:while(true) {
			int[] a = new int[] {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
			if(a[0] == a[1] && a[1] == a[2] && a[2] == a[3] && a[3] == 0) break;
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					for(int k = 0; k < 4; k++) {
						for(int l = 0; l < 4; l++) {
							if(i == j || i == k || i == l || j == k || j == l || k == l) continue;
							for(int o1 = 0; o1 < 3; o1++) {
								for(int o2 = 0; o2 < 3; o2++) {
									for(int o3 = 0; o3 < 3; o3++) {
										if(c(c(a[i],a[j],o1),c(a[k],a[l],o3),o2) == ans) {
											out.println("((" + a[i]+ " " + op[o1] + " " + a[j]+ ")" + " " + op[o2] + " " + "(" + a[k] + " " + op[o3] + " " + a[l]+ "))");
											continue IN;
										}
										else if(c(c(c(a[i],a[j],o1),a[k],o2),a[l],o3) == ans) {
											out.println("(((" + a[i]+ " " + op[o1] + " " + a[j]+ ")" + " " + op[o2] + " " + "" + a[k] + ") " + op[o3] + " " + a[l]+ ")");
											continue IN;
										}
										else if(c(c(a[i],c(a[j],a[k],o2),o1),a[l],o3) == ans) {
											out.println("((" + a[i]+ " " + op[o1] + " (" + a[j]+ "" + " " + op[o2] + "" + " " + a[k] + ")) " + op[o3] + " " + a[l]+ ")");
											continue IN;
										}
									}
								}
							}
						}
					}
				}
			}
			out.println("0");
		}
		out.flush();
	}
	
	static int c(int a, int b, int c) {
		if(c == 0) {
			return a+b;
		}
		if(c == 1) {
			return a-b;
		}
		return a*b;
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
    	return (int)nextLong();
    }
    
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
    

}