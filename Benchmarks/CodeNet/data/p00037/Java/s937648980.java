
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
		pass = new int[9][9];
	    for(int i = 0; i < 9; i++){
	    	String s = sc.next();
            if(i % 2 == 0){
            	Arrays.fill(pass[i], 1);
                for(int j = 0; j < 4; j++){
                	int c = s.charAt(j) - '0';
                    pass[i][j * 2 + 1] = c;
                }
            }
            else {
            	for(int j = 0; j < 5; j++){
            		int c = s.charAt(j) - '0';
            		pass[i][j * 2] = c;
                }
            }
        }
	    solv();
	    out.println();
	    out.flush();
	    
	}
	static void solv() {
		int [] vx = {-1,0,1,0};
        int [] vy = {0,-1,0,1};
        String [] word = {"L", "U", "R", "D"};
        int nowx = 0, nowy = 0;
        int dir = 2;
        
	    while(true){
	        for(int i = 3; i < 7; i++){
	            int xx = nowx + vx[(i + dir) % 4];
	            int yy = nowy + vy[(i + dir) % 4];
	            int xxx = xx + vx[(i + dir) % 4];
	            int yyy = yy + vy[(i + dir) % 4];
	            if(! isOK(xx, yy, 9)) continue;
	            if(! isOK(xxx, yyy, 9)) continue;
	            if(pass[yy][xx] == 0) continue;
	            if(pass[yyy][xxx] == 0) continue;
	            nowx = xxx;
	            nowy = yyy;
	            dir = (i + dir) % 4;
	            out.print(word[dir]);;
	            break;
	        }
	        if(nowx == 0 && nowy == 0){
	            break;
	        }
	    }
	}

	static boolean isOK(int x,int y,int mapsize){
		if(0 <= x && x < mapsize && 0 <= y && y < mapsize){
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
    	return (int)nextLong();
    }
    
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
    

}