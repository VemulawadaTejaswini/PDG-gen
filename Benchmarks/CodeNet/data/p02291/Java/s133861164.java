import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.CountDownLatch;

import javax.sound.midi.MidiMessage;
 
public class Main {
		static long MOD=(long) (Math.pow(10, 9)+7);
	public static void main(String[] args){
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int q = sc.nextInt();
        Geometric geometric=new Geometric();
        for(int i = 0 ; i < q ; i++){
            int px = sc.nextInt();
            int py = sc.nextInt();
            double[] kummi=geometric.project2((double)x1,(double)y1,(double)x2,(double)y2,(double)px,(double)py);
            out.println(kummi[0]+" "+kummi[1]);
        }
        out.flush();
	}
	static class Geometric{
		double[] project(double x1, double y1, double x2, double y2, double px, double py){
	        if(y1 == y2) {
	        	double[] ans= {px,y1};
	        	return ans;
	        	}
	        else if(x1 == x2) {
	        	double[] ans= {x1,py};
	        	return ans;
	        }
	        else{
	            double katamuki1 = (y2 - y1)/(x2 - x1);
	            double seppen1 = -katamuki1 * x1 + y1;
	            double katamuki2 = -1.0 / katamuki1;
	            double seppen2 = -katamuki2 * px + py;
	            double ansx = (seppen2 - seppen1)/(katamuki1 - katamuki2);
	            double ansy = ansx * katamuki1 + seppen1;
	            double[] ans= {ansx,ansy};
	            return ans;
	        }
	    }
	    double[] project2(double x1, double y1, double x2, double y2, double px, double py){
	        if(y1 == y2) {
	        	double[] ans= {px,(py - 2*(py - y1))};
	        	return ans;
	        }
	        else if(x1 == x2) {
	        	double[] ans= {(px - 2*(px - x1)),py};
	        	return ans;
	        }
	        else{
	            double katamuki1 = (y2 - y1)/(x2 - x1);
	            double seppen1 = -1.0 * katamuki1 * x1 + y1;
	            double katamuki2 = -1.0 / katamuki1;
	            double seppen2 = -1.0 * katamuki2 * px + py;
	            double ansx = (seppen2 - seppen1)/(katamuki1 - katamuki2);
	            double ansy = ansx * katamuki1 + seppen1;
	            double[] ans= {(px - 2*(px - ansx)),(py- 2 * (py - ansy))};
	            return ans;
	        }
	    }
	}
	static class InputReader { 
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;
		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}
 
		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}
 
		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}
 
		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}
 
		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}
 
		public boolean hasNext() {
			skip();
			return hasNextByte();
		}
 
		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
 
		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public double nextDouble() {
			return Double.parseDouble(next());
		}
 
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
 
		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
