import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		K:while(sc.hasNext()) {
			String data = sc.next();
			IN:for(int i = 0; i < 3; i++) {
				char tmp = data.charAt(i * 3);
				if(tmp == 's') continue IN;
				for(int j = 1; j < 3; j++) {
					if(tmp != data.charAt(i*3+j)) continue IN;
				}
				out.println(tmp);
				continue K;
			}
			IN:for(int i = 0; i < 3; i++) {
				char tmp = data.charAt(i);
				if(tmp == 's') continue IN;
				for(int j = 1; j < 3; j++) {
					if(tmp != data.charAt(i + 3*j)) continue IN;
				}
				out.println(tmp);
				continue K;
			}
			char tmpA = data.charAt(0);
			char tmpB = data.charAt(7);
			
			char ans = 'd';
			if(data.charAt(0) == data.charAt(4) && data.charAt(4) == data.charAt(8) && data.charAt(0) != 's') ans = data.charAt(0);
			else if(data.charAt(2) == data.charAt(4) && data.charAt(4) == data.charAt(6) && data.charAt(2) != 's') ans = data.charAt(2);
			out.println(ans);
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
}