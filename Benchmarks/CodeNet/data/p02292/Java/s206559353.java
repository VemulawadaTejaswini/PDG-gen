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
            int kummi=geometric.direction((double)x1,(double)y1,(double)x2,(double)y2,(double)px,(double)py);
            if (kummi==1) {
				out.println("COUNTER_CLOCKWISE");
			}
            else if (kummi==2) {
				out.println("CLOCKWISE");
			}
            else if (kummi==3) {
				out.println("ONLINE_BACK");
			}
            else if (kummi==4) {
				out.println("ONLINE_FRONT");
			}
            else {
				out.println("ON_SEGMENT");
			}
        }
        out.flush();
	}
	static class Geometric{
		static final double eps = 0.0000000001;
		double[] project(double x1, double y1, double x2, double y2, double px, double py){
			//(x1,y1)と(x2,y2)を直線lとして、(px,py)からlに下した垂線の足をもとめる。
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
	    	//(x1,y1)と(x2,y2)を直線lとして、lに対して(px,py)の対称な点をもとめる。
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
	    public double d2(double x0,double y0,double x1,double y1){
			return (x0-x1)*(x0-x1) + (y0-y1)*(y0-y1);
		}
		
	    int direction(double x0,double y0,double x1,double y1,double x2,double y2){
			//x0 y0を起点としてp1ベクトル（x1-x0,y1-y0）から見てp2ベクトルが、反時計回りなら１、時計回りなら２、反対方向なら３、
	    	//同じ方向かつp2のほうが大きい場合４、以下の場合５．
			if(x1 == x0 && y1 == y0){
				return 4;
			}
			else if(x2 == x0 && y2 == y0){
				return 5;
			}
			
			//外積の第三成分 = |→p1||→p2|sinθ
			double det = (x1 -x0)*(y2-y0) - (x2 -x0)*(y1 - y0);
			
			if(det>eps){
				return 1;
			}
			else if(det<-eps){
				return 2;
			}
			else{	//同一直線状
				if((x1-x0 >0 == x2-x0 <0) && x1-x0 != 0){	//反対側
					return 3;
				}
				else if((y1-y0 >0 == y2-y0 <0) && y1-y0 != 0){	//反対側
					return 3;
				}
				else{
					double d10 = d2(x0,y0,x1,y1);	//p1とp0の距離^2
					double d20 = d2(x0,y0,x2,y2);	//p2とp0の距離^2
					if(d10 < d20){	//p2のほうが遠い
						return 4;
					}
					else{
						return 5;
					}
				}
			}
		}
	    int paralell_or_vertical(double x0,double y0,double x1,double y1,double x2,double y2,double x3,double y3) {
	    	//平行なら2　垂直なら1　それ以外は０を返す。
	    	double naiseki=(x1-x0)*(x3-x2)+(y1-y0)*(y3-y2);
	    	double d1=Math.sqrt(d2(x0, y0, x1, y1));
	    	double d2=Math.sqrt(d2(x2, y2, x3, y3));
	    	double cos=naiseki/(d1*d2);
	    	
	    	if (cos+eps>=1||cos-eps<=-1) {
				return 2;
			}
	    	else if(cos<eps&&cos>-eps){
				return 1;
			}
	    	else {
				return 0;
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
