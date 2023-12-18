
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
import java.util.Scanner;
public class Main {
    static final HashMap<Character, String> map1 = new HashMap<Character, String>() {
        {
            put(' ', "101");
            put('\'', "000000");
            put(',', "000011");
            put('-', "10010001");
            put('.', "010001");
            put('?', "000001");
            put('A', "100101");
            put('B', "10011010");
            put('C', "0101");
            put('D', "0001");
            put('E', "110");
            put('F', "01001");
            put('G', "10011011");
            put('H', "010000");
            put('I', "0111");
            put('J', "10011000");
            put('K', "0110");
            put('L', "00100");
            put('M', "10011001");
            put('N', "10011110");
            put('O', "00101");
            put('P', "111");
            put('Q', "10011111");
            put('R', "1000");
            put('S', "00110");
            put('T', "00111");
            put('U', "10011100");
            put('V', "10011101");
            put('W', "000010");
            put('X', "10010010");
            put('Y', "10010011");
            put('Z', "10010000");
        }
    };
 
    static final HashMap<String, Character> map2 = new HashMap<String, Character>() {
        {
            put("00000", 'A');
            put("00001", 'B');
            put("00010", 'C');
            put("00011", 'D');
            put("00100", 'E');
            put("00101", 'F');
            put("00110", 'G');
            put("00111", 'H');
            put("01000", 'I');
            put("01001", 'J');
            put("01010", 'K');
            put("01011", 'L');
            put("01100", 'M');
            put("01101", 'N');
            put("01110", 'O');
            put("01111", 'P');
            put("10000", 'Q');
            put("10001", 'R');
            put("10010", 'S');
            put("10011", 'T');
            put("10100", 'U');
            put("10101", 'V');
            put("10110", 'W');
            put("10111", 'X');
            put("11000", 'Y');
            put("11001", 'Z');
            put("11010", ' ');
            put("11011", '.');
            put("11100", ',');
            put("11101", '-');
            put("11110", '\'');
            put("11111", '?');
        }
    };
 
	public static void main(String[] args) {
		
		FastScanner sc = new FastScanner();
		Scanner stdIn = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		
		while(sc.hasNext()) {
			StringBuffer buf = new StringBuffer();
			buf.append(stdIn.nextLine());
			StringBuffer buf2 = new StringBuffer();
			for(int i = 0; i < buf.length(); i++) {
				buf2.append(map1.get(buf.charAt(i)));
			}
			if(buf2.length() % 5 != 5) {
				for(int i = buf2.length() % 5; i <= 5; i++) {
					buf2.append("0");
				}
			}
			buf = new StringBuffer();
			for(int i = 0; i < buf2.length()/5; i++) {
				buf.append(map2.get(buf2.substring(i*5,(i+1)*5)));
			}
			out.println(buf.toString());
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
    	return (int)nextLong();
    }
    

}