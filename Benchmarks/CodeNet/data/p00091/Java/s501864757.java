
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

import javax.xml.crypto.Data;
public class Main {
	static boolean[] ans;
	static int[][] pass;
	static PrintWriter out = new PrintWriter(System.out);
	static FastScanner sc = new FastScanner();
	static int[][] map;
	static int n;
	public static void main(String[] args) {
		n = sc.nextInt();
		map = new int[10][10];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		ArrayList<Data> ans = solv(1,1,0,new int[10][10], new ArrayList<Data>());
		for(int i = 0; i < ans.size(); i++) {
			out.println(ans.get(i).x + " " + ans.get(i).y + " " + ans.get(i).size);
		}
		
		out.flush();

	}
	static ArrayList<Data> solv(int xd, int yd, int count, int[][] now, ArrayList<Data> re) {
		int x = xd;
		int y = yd;
		if(now[y][x] > map[y][x]) return null;
		if(x == 9) {
			y += 1;
			x = 0;
		}
		if(y - 3 >= 0) {
			for(int i = 0; i < 10; i++) {
				if(now[y-3][i] != map[y-3][i]) return null;
			}
		}
		
		if(n < count) return null;
		if(n == count) {
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
					if(now[i][j] != map[i][j]) return null;
				}
			}
			return re;
		}
		
		if(y-1 >= 0 && y+1 < 10 && x-1 >= 0 && x+1 < 10) {
			int[][] cpy = new int[10][];
			for(int i = 0; i < 10; i++) {
				cpy[i] = Arrays.copyOf(now[i], 10);
			}
			
			cpy[y][x]++;
			cpy[y-1][x]++;
			cpy[y+1][x]++;
			cpy[y][x+1]++;
			cpy[y][x-1]++;
			
			ArrayList<Data> cpr = new ArrayList<Data>(re);
			cpr.add(new Data(x,y,1));
			cpr = solv(x,y,count+1,cpy,cpr);
			if(cpr != null) return cpr;
			
			for(int i = 0; i < 10; i++) {
				cpy[i] = Arrays.copyOf(now[i], 10);
			}
			cpy[y][x]++;
			cpy[y-1][x]++;
			cpy[y+1][x]++;
			cpy[y][x+1]++;
			cpy[y][x-1]++;
			cpr = new ArrayList<Data>(re);
			cpr.add(new Data(x,y,1));
			cpr = solv(x+1,y,count+1,cpy,cpr);
			if(cpr != null) return cpr;
			
			for(int i = 0; i < 10; i++) {
				cpy[i] = Arrays.copyOf(now[i], 10);
			}
			cpy[y][x]++;
			cpy[y-1][x]++;
			cpy[y+1][x]++;
			cpy[y][x+1]++;
			cpy[y][x-1]++;
			cpy[y+1][x+1]++;
			cpy[y+1][x-1]++;
			cpy[y-1][x+1]++;
			cpy[y-1][x-1]++;
			cpr = new ArrayList<Data>(re);
			cpr.add(new Data(x,y,2));
			cpr = solv(x,y,count+1,cpy,cpr);
			if(cpr != null) return cpr;
			
			for(int i = 0; i < 10; i++) {
				cpy[i] = Arrays.copyOf(now[i], 10);
			}
			cpy[y][x]++;
			cpy[y-1][x]++;
			cpy[y+1][x]++;
			cpy[y][x+1]++;
			cpy[y][x-1]++;
			cpy[y+1][x+1]++;
			cpy[y+1][x-1]++;
			cpy[y-1][x+1]++;
			cpy[y-1][x-1]++;
			cpr = new ArrayList<Data>(re);
			cpr.add(new Data(x,y,2));
			cpr = solv(x+1,y,count+1,cpy,cpr);
			if(cpr != null) return cpr;
			
		}
		
		if(x - 2 >= 0 && x + 2 < 10 && y - 2 >= 0 && y + 2 < 10) {
			int[][] cpy = new int[10][];
			for(int i = 0; i < 10; i++) {
				cpy[i] = Arrays.copyOf(now[i], 10);
			}
			
			cpy[y][x]++;
			cpy[y-1][x]++;
			cpy[y+1][x]++;
			cpy[y][x+1]++;
			cpy[y][x-1]++;
			cpy[y+1][x+1]++;
			cpy[y+1][x-1]++;
			cpy[y-1][x+1]++;
			cpy[y-1][x-1]++;
			cpy[y-2][x]++;
			cpy[y+2][x]++;
			cpy[y][x-2]++;
			cpy[y][x+2]++;
			ArrayList<Data> cpr = new ArrayList<Data>(re);
			cpr.add(new Data(x,y,3));
			cpr = solv(x,y,count+1,cpy,cpr);
			if(cpr != null) return cpr;
			
			for(int i = 0; i < 10; i++) {
				cpy[i] = Arrays.copyOf(now[i], 10);
			}
			cpy[y][x]++;
			cpy[y-1][x]++;
			cpy[y+1][x]++;
			cpy[y][x+1]++;
			cpy[y][x-1]++;
			cpy[y+1][x+1]++;
			cpy[y+1][x-1]++;
			cpy[y-1][x+1]++;
			cpy[y-1][x-1]++;
			cpy[y-2][x]++;
			cpy[y+2][x]++;
			cpy[y][x-2]++;
			cpy[y][x+2]++;
			cpr = new ArrayList<Data>(re);
			cpr.add(new Data(x,y,3));
			cpr = solv(x+1,y,count+1,cpy,cpr);
			if(cpr != null) return cpr;
		}
		
		int[][] cpy = new int[10][];
		for(int i = 0; i < 10; i++) {
			cpy[i] = Arrays.copyOf(now[i], 10);
		}
		ArrayList<Data> cpr = new ArrayList<Data>(re);
		cpr = solv(x+1,y,count,cpy,cpr);
		if(cpr != null) return cpr;
		
		return null;
		
		
	}
	
	static class Data {
		int x;
		int y;
		int size;
		Data(int a, int b, int c) {
			x = a;
			y = b;
			size = c;
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
    
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
    

}