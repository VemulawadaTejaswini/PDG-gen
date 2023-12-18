import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	//static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        ArrayList<Point> pol = new ArrayList<>();
        
        for(int i=0;i<n;i++){
        	pol.add(new Point(sc.nextDouble(),sc.nextDouble()));
        }
        
        Polygon polygon = new Polygon(pol);

        int q = sc.nextInt();
        
        for(int i=0;i<q;i++){
        	System.out.println(polygon.pointContain(new Point(sc.nextDouble(),sc.nextDouble())));
        }
    }

    
}

class Polygon {
	static final double allowableError = 0.00000001;
	ArrayList<Point> pol; //反時計周り
	
	public Polygon(ArrayList<Point> pol){
		this.pol = pol;
	}
	
	//面積を導出
	double area(){
		//|det|/2は作る三角形の面積に一致
		double ans = 0;
		
		for(int i=0;i<pol.size();i++){
			ans += det(pol.get(i), pol.get(next(i)));
		}
		
		return ans/2;
	}
	
	//pが多角形に含まれるなら2、pが辺上にあるなら1、pが外側にあるなら0を返す
	int pointContain(Point p){
		//pからx軸と平行・正方向の半直線を引き、奇数回交差すれば内部にある
		boolean isIn = false;
		for(int i=0;i<pol.size();i++){
			int upid = i;
			int downid = next(i);
			if(pol.get(i).y < pol.get(next(i)).y){
				upid = next(i);
				downid = i;
			}
			
			//ベクトルを便宜的に
			Point pup = new Point(pol.get(upid).x - p.x, pol.get(upid).y - p.y);	//p→p_i
			Point pdown = new Point(pol.get(downid).x - p.x, pol.get(downid).y - p.y); //p→p_next(i)
			
			double det = det(pup, pdown);
			if(pup.y > 0 && 0 >= pdown.y){	//2重カウントしないために不等号を>と>=にする
				if(det < 0){
					isIn = !isIn;
				}
			}
			
			//辺上判定
			if(Math.abs(det) < allowableError){	//p→p_iとp→p_next(i)が一直線上
				if(pup.x * pdown.x + pup.y * pdown.y <= 0){	//pからみて同方向でない
					return 1;
				}
			}
		}
		
		if(isIn){
			return 2;
		}
		else{
			return 0;
		}
	}
	
	//反時計回りに1つ進んだ頂点のindex
	int next(int id){
		int size = pol.size();
		if(id<=size-2){
			return id+1;
		}
		else{
			return 0;
		}
	}
	//ベクトルのdet
	static double det(double x1, double y1, double x2, double y2){
		return x1*y2 - x2*y1;
	}
	static double det(Point p, Point q){
		return p.x*q.y - p.y*q.x;
	}
	
	//p0を起点に、p1へのベクトルからみてp2へのベクトルが反時計回りなら1、時計回りなら2
	//↑が同一直線状にあるとき、→p2が→p1と反対側なら3、→p2が→p1の延長線上なら4、→p2が→p1上にあれば5を返す
	static int direction(Point p0, Point p1, Point p2) {
		if(p0.x == p1.x) {
			if(p2.x == p0.x) {
				if((p0.y <= p2.y && p2.y <= p1.y) || (p1.y <= p2.y && p2.y <= p0.y)) {
					return 5;
				}else if (d2(p0,p2) < d2(p1,p2)) {
					return 3;
				}else {
					return 4;
				}
			}else if ((p0.y < p1.y && p2.x < p0.x) || (p0.y > p1.y && p2.x > p0.x)) {
				return 1;
			}else {
				return 2;
			}

		}else{
			//y=ax+b上にp0,p1が存在
			double a = (p1.y - p0.y) / (p1.x - p0.x);
			double b = p1.y - a * p1.x;
			if(Math.abs(p2.y - (a * p2.x + b)) < allowableError) {
				if((p0.x <= p2.x && p2.x <= p1.x) || (p1.x <= p2.x && p2.x <= p0.x)) {
					return 5;
				}else if (d2(p0,p2) < d2(p1,p2)) {
					return 3;
				}else {
					return 4;
				}
			}else if ((p0.x < p1.x && p2.y - (a * p2.x + b) > 0) || (p0.x > p1.x && p2.y - (a * p2.x + b) < 0)) {
				return 1;
			}else {
				return 2;
			}
		}
	}
	//ユークリッド距離の2乗
	static double d2(Point p1, Point p2){
		return (p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y);
	}

}

class Point implements Comparable<Point>{
	double x,y;
	
	public Point(double a, double b){
		this.x = a;
		this.y = b;
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
	public int[] nextIntArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
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
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
