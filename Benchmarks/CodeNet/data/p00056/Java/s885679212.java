import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		makePrimeList(50001);
		int[] listx = new int[50001];
		for(int i = 0; i < list.size(); i++) {
			for(int j = i; j < list.size(); j++) {
				int sum = list.get(i) + list.get(j);
				if(sum > 50000) break;
				listx[sum]++;
			}
		}
		while(true) {
			int n = (int)sc.nextLong();
			if(n == 0) break;
			
			
			out.println(listx[n]);
		}
		out.flush();
	}

	public static void makePrimeList(int n) {
		boolean[] isntPrime = new boolean[n];
		isntPrime[0] = isntPrime[1] = true;
		list.add(2);
		for(int i = 3; i < n; i+=2) {
			if(!isntPrime[i]) {
				list.add(i);
				for(int j = i+i; j < n; j+=i) {
					isntPrime[j] = true;
				}
			}
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
}