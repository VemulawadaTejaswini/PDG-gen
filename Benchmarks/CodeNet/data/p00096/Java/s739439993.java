
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
	
	public static void main(String[] args) {
		
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int[] list = new int[2001];
		int[] list2 = new int[4001];
		for(int i = 0; i <= 1000; i++) {
			for(int j = 0; j <= 1000; j++) {
				list[i+j]++;
			}
		}
		for(int i = 0; i < 2001; i++) {
			for(int j = 0; j < 2001; j++) {
				list2[i + j] += list[i] * list[j];
			}
		}
		

		while(sc.hasNext()) {
			int n = sc.nextInt();
			out.println(list2[n]);
		}
		
		
		out.flush();
	}
	
	static class Data {
		int id;
		int point;
		Data(int a, int b) {
			id = a;
			point = b;
		}
	}
	
	static class Comp implements Comparator<Data>{

		@Override
		public int compare(Data o1, Data o2) {
			if(o1.point > o2.point) {
				return -1;
			}
			if(o1.point < o2.point) {
				return 1;
			}
			if(o1.id < o2.id) {
				return -1;
			}
			
			return 1;
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
    	return (int)nextLong();
    }
    

}