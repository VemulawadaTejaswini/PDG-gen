import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
	static double dp[][][][][][];
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
         
        int n = sc.nextInt();
         
        Point[] list = new Point[n];
         
        for(int i=0;i<n;i++){
            list[i] = new Point(sc.nextDouble(),sc.nextDouble());
        }
         
        out.printf("%.10f",closestPair(list));
         
        out.flush();
    }
     
    double closestPair(Point[] list){
        Arrays.sort(list);
        return closestPair(list,0,list.length);
    }
    double closestPair(Point[] list, int l, int r){
        int n = r-l;
        if(n<=1){
            return Double.POSITIVE_INFINITY;    //1点しかない
        }
        if(n==2){
            return list[l].dist(list[l+1]);
        }
          
        int m = (l+r)/2;
          
        //左半分と右半分の最近点対の距離のうち小さい方
        double d = Math.min(closestPair(list,l,m), closestPair(list,m,r));
         
        //左半分と右半分にまたがる点対のチェック
        int centersize = 0;
        double lmedX = list[m-1].x;
        double rmedX = list[m].x;
        
        for(int i=l;i<m;i++){
            if(rmedX - list[i].x <= d){
                centersize++;
            }
        }
        for(int i=m;i<r;i++){
            if(list[i].x - lmedX <= d){
                centersize++;
            }
        }
        Point[] center = new Point[centersize];
        int nowid = 0;
        
        for(int i=l;i<m;i++){
            if(rmedX - list[i].x <= d){
                center[nowid] = list[i];
                nowid++;
            }
        }
        for(int i=m;i<r;i++){
            if(list[i].x - lmedX <= d){
                center[nowid] = list[i];
                nowid++;
            }
        }
         
        Arrays.sort(center, (i,j) -> Double.compare(i.y, j.y)); //y座標でソート
         
        for(int i=0;i<center.length;i++){
            for(int j=i+1;j<center.length;j++){
                Point pi = center[i];
                Point pj = center[j];
                double xdif = Math.abs(pi.x - pj.x);
                if(xdif>=d){
                    continue;
                }
                double ydif = pj.y - pi.y;
                if(ydif>=d){
                    break;
                }
                //ここに到達する点が各iに対し定数個で抑えられる
                double nowd = Math.sqrt(xdif*xdif + ydif*ydif);
                  
                if(nowd < d){
                    d = nowd;
                }
            }
        }
          
        return d;
    }
}

class Point implements Comparable<Point>{
    double x,y;
    static final double eps = 0.00000001;
     
    public Point(double a, double b){
        this.x = a;
        this.y = b;
    }
     
    //距離の2乗
    public double d2(Point b){
        return (x-b.x)*(x-b.x) + (y-b.y)*(y-b.y);
    }
     
    //通常のユークリッド距離
    public double dist(Point b){
        return Math.sqrt((x-b.x)*(x-b.x) + (y-b.y)*(y-b.y));
    }
     
    //p1へのベクトルからみてp2へのベクトルが反時計回りなら1、時計回りなら2
    //↑が同一直線状にあるとき、→p2が→p1と反対側なら3、→p2が→p1の延長線上なら4、→p2が→p1上にあれば5を返す
    int direction(Point p1, Point p2){
         
        //p0 != p1は仮定、p2は分からない
        if(p2.x == x && p2.y == y){
            return 5;
        }
         
        //外積の第三成分 = |→p1||→p2|sinθ
        double det = (p1.x -x)*(p2.y-y) - (p2.x -x)*(p1.y - y);
         
        if(det>eps){
            return 1;
        }
        else if(det<-eps){
            return 2;
        }
        else{   //同一直線状
            if((p1.x-x >0 == p2.x-x <0) && p1.x-x != 0){  //反対側
                return 3;
            }
            else if((p1.y-y >0 == p2.y-y <0) && p1.y-y != 0){ //反対側
                return 3;
            }
            else{
                double d10 = d2(p1);    //p1とp0の距離^2
                double d20 = d2(p2);    //p2とp0の距離^2
                if(d10 < d20){   //p2のほうが遠い
                    return 4;
                }
                else{
                    return 5;
                }
            }
        }
         
    }
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
            return false;
        if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
            return false;
        return true;
    }
     
    @Override
    public int compareTo(Point o){
        if(x!=o.x){
            return Double.compare(x,o.x);
        }
        return Double.compare(y, o.y);
    }
 
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
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
	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public int[] nextintArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public long[] nextlongArray(int n){
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = nextLong();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public int[][] nextintMatrix(int h, int w){
		int[][] mat = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				mat[i][j] = nextInt();
			}
		}
		return mat;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
