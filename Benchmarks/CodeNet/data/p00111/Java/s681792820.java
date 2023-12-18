
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

	static HashMap<String,String> mapA = new HashMap<String,String>();
	static HashMap<String,String> mapB = new HashMap<String,String>();
 	static {
		mapA.put("A","00000");
		mapA.put("B","00001");
		mapA.put("C","00010");
		mapA.put("D","00011");
		mapA.put("E","00100");
		mapA.put("F","00101");
		mapA.put("G","00110");
		mapA.put("H","00111");
		mapA.put("I","01000");
		mapA.put("J","01001");
		mapA.put("K","01010");
		mapA.put("L","01011");
		mapA.put("M","01100");
		mapA.put("N","01101");
		mapA.put("O","01110");
		mapA.put("P","01111");
		mapA.put("Q","10000");
		mapA.put("R","10001");
		mapA.put("S","10010");
		mapA.put("T","10011");
		mapA.put("U","10100");
		mapA.put("V","10101");
		mapA.put("W","10110");
		mapA.put("X","10111");
		mapA.put("Y","11000");
		mapA.put("Z","11001");
		mapA.put(" ","11010");
		mapA.put(".","11011");
		mapA.put(",","11100");
		mapA.put("-","11101");
		mapA.put("'","11110");
		mapA.put("?","11111");
		
		
		mapB.put("101", " ");
		mapB.put("000000", "'");
		mapB.put("000011", ",");
		mapB.put("10010001", "-");
		mapB.put("010001", ".");
		mapB.put("000001", "?");
		mapB.put("100101", "A");
		mapB.put("10011010", "B");
		mapB.put("0101", "C");
		mapB.put("0001", "D");
		mapB.put("110", "E");
		mapB.put("01001", "F");
		mapB.put("10011011", "G");
		mapB.put("010000", "H");
		mapB.put("0111", "I");
		mapB.put("10011000", "J");
		mapB.put("0110", "K");
		mapB.put("00100", "L");
		mapB.put("10011001", "M");
		mapB.put("10011110", "N");
		mapB.put("00101", "O");
		mapB.put("111", "P");
		mapB.put("10011111", "Q");
		mapB.put("1000", "R");
		mapB.put("00110", "S");
		mapB.put("00111", "T");
		mapB.put("10011100", "U");
		mapB.put("10011101", "V");
		mapB.put("000010", "W");
		mapB.put("10010010", "X");
		mapB.put("10010011", "Y");
		mapB.put("10010000", "Z");
		
	}
	public static void main(String[] args) {
		while(stdIn.hasNext()) {
			StringBuilder tmp = new StringBuilder(stdIn.nextLine());
			StringBuilder str = new StringBuilder();
			for(int i = 0; i < tmp.length(); i++) {
				str.append(mapA.get(tmp.substring(i, i+1)));
			}
			StringBuilder ans = new StringBuilder();
			for(int i = 0; i < str.length(); i++) {
				StringBuilder buf = new StringBuilder(str.substring(i, i+1));
				int p = i;
				while(true) {
					p++;
					if(mapB.containsKey(buf.toString())) {
						ans.append(mapB.get(buf.toString()));
						buf.deleteCharAt(0);
						i = p-1;
						break;
					}
					if(p == str.length()) break;
					buf.append(str.substring(p, p+1));
				}
			}
			out.println(ans.toString());
		}
		out.flush();
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