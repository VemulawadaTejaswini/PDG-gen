
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
		while(sc.hasNext()) {
			String[] tmp = sc.next().split(",");
			double x1 = Double.parseDouble(tmp[0]);
			double y1 = Double.parseDouble(tmp[1]);
			double x2 = Double.parseDouble(tmp[2]);
			double y2 = Double.parseDouble(tmp[3]);
			double xq = Double.parseDouble(tmp[4]);
			double yq = Double.parseDouble(tmp[5]);
			if(x1 == x2) {
				out.println(2*x1-xq + " " + yq);
				continue;
			}
			if(y1 == y2) {
				out.println(xq + " " + (2*y1-yq));
				continue;
			}
			double a1=(y2-y1)/(x2-x1);
            double a2=(-1)/a1;
            double b1=y1-a1*x1;
            double b2=yq-a2*xq;
            double xm=(b2-b1)/(a1-a2);
            double x=2*xm-xq;
            double y=a2*x+b2;
            out.println(x + " " + y);
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