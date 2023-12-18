import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final int INF = 2 << 28;
	static final long INF_L = 2L << 60;
	static final int  MOD = 1000000007;
	static final long MOD_L = 1000000007L;
	static final int[] vx_4 = {1,0,-1,0};
	static final int[] vy_4 = {0,1,0,-1};
	static final int[] vx_5 = {1,0,-1,0,0};
	static final int[] vy_5 = {0,1,0,-1,0};
	static final int[] vx_8 = {1,1,1,0,0,-1,-1,-1};
	static final int[] vy_8 = {1,0,-1,1,-1,1,0,-1};
	static final int[] vx_9 = {1,1,1,0,0,0,-1,-1,-1};
	static final int[] vy_9 = {1,0,-1,1,0,-1,1,0,-1};
	
	static char[] A;
	static char[] B;
	static char[] C;
	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Geometry3D.Point[] pA = new Geometry3D.Point[n];
		int[]   rA = new int[n];
		int[]   lA = new int[n];
		for(int i = 0; i < n; i++) {
			pA[i] = new Geometry3D.Point(sc.nextInt(), sc.nextInt(), sc.nextInt());
			rA[i] = sc.nextInt();
			lA[i] = sc.nextInt();
		}
		for(int i = 0; i < q; i++) {
			Geometry3D.Point sP = new Geometry3D.Point(sc.nextInt(), sc.nextInt(), sc.nextInt());
			Geometry3D.Point dP = new Geometry3D.Point(sc.nextInt(), sc.nextInt(), sc.nextInt());
			int ans = 0;
			for(int j = 0; j < n; j++) {
				if(Geometry3D.intersectSC(sP, dP, pA[j], rA[j])) {
					ans += lA[j];
				}
			}
			System.out.println(ans);
			
		}
	}
	
	static class Geometry3D {

	    static final double EPS = 1e-5;

	    static boolean approxEquals(double a, double b) {
	        return Math.abs(a - b) < EPS;
	    }

	    static class Point implements Comparable<Point> {

	        final double x, y, z;

	        public Point(double x, double y, double z) {
	            this.x = x;
	            this.y = y;
	            this.z = z;
	        }

	        /** ?????????dot(v1,v2)=|v1||v2|cos?? */
	        double dot(Point p) {
	            return x * p.x + y * p.y + z * p.z;
	        }

	        /** ?????????|cross(v1,v2)|=|v1||v2||sin??| */
	        Point cross(Point p) {
	            return new Point(y * p.z - z * p.y, z * p.x - x * p.z, x * p.y - y * p.x);
	        }

	        double distanceSqr() {
	            return x * x + y * y + z * z;
	        }

	        double distance() {
	            return Math.sqrt(distanceSqr());
	        }

	        double distanceSqr(Point p) {
	            return subtract(p).distanceSqr();
	        }

	        double distance(Point p) {
	            return subtract(p).distance();
	        }

	        Point add(Point p) {
	            return new Point(x + p.x, y + p.y, z + p.z);
	        }

	        Point multiply(double k) {
	            return new Point(k * x, k * y, k * z);
	        }

	        Point subtract(Point p) {
	            return new Point(x - p.x, y - p.y, z - p.z);
	        }

	        @Override
	        public boolean equals(Object obj) {  // ????????¢??°???Eclipse??§??????????????§?¨?????????????????????????????????°??????
	            if (this == obj) return true;
	            if (obj == null) return false;
	            if (getClass() != obj.getClass()) return false;
	            Point other = (Point) obj;
	            if (!approxEquals(x, other.x)) return false;
	            if (!approxEquals(y, other.y)) return false;
	            if (!approxEquals(z, other.z)) return false;
	            return true;
	        }

	        @Override
	        public int compareTo(Point o) {
	            if (!approxEquals(x, o.x)) return (int) Math.signum(x - o.x);
	            if (!approxEquals(y, o.y)) return (int) Math.signum(y - o.y);
	            if (!approxEquals(z, o.z)) return (int) Math.signum(z - o.z);
	            return 0;
	        }

	        @Override
	        public String toString() {
	            return "(" + x + "," + y + "," + z + ")";
	        }

	    }

	    /**
	     * @param a
	     * @param b
	     * @param c
	     * @param world ????????§?¨?????????´
	     * @return ?????????????????¨??????ccw
	     * @see Geometries2D#ccw(Point, Point, Point)
	     */
	    static int ccw(Point a, Point b, Point c, Point world) {
	        b = b.subtract(a);
	        c = c.subtract(a);
	        double d = world.dot(b.cross(c));
	        if (d > EPS) return +1;                           // counter clockwise
	        if (d + EPS < 0) return -1;                       // clockwise
	        // b??¨c???world????????±????????????????????¨????????????
	        //        if (b.dot(c) + EPS < 0) return +2;                // c--a--b on plane
	        //        if (b.distanceSqr() < c.distanceSqr()) return -2; // a--b--c on plane
	        return 0;                                         // on same projected line
	    }

	    /**
	     * @param n ????????????????????????
	     * @return ????????????p???????????????n??¨??????theta[rad]???????????????????????????
	     * @see http://hooktail.sub.jp/vectoranalysis/vectorRot/
	     */
	    static Point rotate(Point p, Point n, double theta) {
	        Point on = n.multiply(n.dot(p));
	        Point nv = p.subtract(on).multiply(Math.cos(theta));
	        Point qv = p.cross(n).multiply(Math.sin(theta));
	        return on.add(nv).subtract(qv);
	    }

	    /**
	     * @param a ?????¢??????1???
	     * @param n ?????¢?????????????????????
	     * @param p
	     * @return ???p????????¢????????±????????¨?????????
	     */
	    static Point projectOnPlane(Point a, Point n, Point p) {
	        Point ap = p.subtract(a);
	        double t = n.dot(ap) / n.distanceSqr();
	        return p.subtract(n.multiply(t));
	    }

	    /** @return ??´???a??????p????????±????????¨????????? */
	    static Point projectOnLine(Point a1, Point a2, Point p) {
	        Point a = a2.subtract(a1);
	        p = p.subtract(a1);
	        double t = a.dot(p) / a.distanceSqr();
	        return a1.add(a.multiply(t));
	    }

	    static double distancePlaneP(Point a, Point n, Point p) {
	        return projectOnPlane(a, n, p).distance(p);
	    }

	    static double distanceLP(Point a1, Point a2, Point p) {
	        return projectOnLine(a1, a2, p).distance(p);
	    }

	    static double distanceSP(Point a1, Point a2, Point p) {
	        Point r = projectOnLine(a1, a2, p);
	        // ?????±??????????????????????????????????????????p??????????????????????????¢???????????°??????
	        Point ra1 = a1.subtract(r);
	        Point ra2 = a2.subtract(r);
	        double dot = ra1.dot(ra2);
	        if (dot < EPS && approxEquals(dot * dot, ra1.distanceSqr() * ra2.distanceSqr())) return r
	                .distance(p);
	        // ????????§???????????°????????????????????¨????????¢
	        return Math.min(a1.distance(p), a2.distance(p));
	    }

	    /**
	     * ?????????????????¢????????????????????????????????????crosspointLL()????????¶???
	     * 
	     * @see http://mathforum.org/library/drmath/view/51980.html
	     */
	    static double distanceLL(Point a1, Point a2, Point b1, Point b2) {
	        Point n = a2.subtract(a1).cross(b2.subtract(b1));
	        // n???0??????2??´??????????????????????????????????????§??????
	        if (n.distanceSqr() < EPS) return distanceLP(a1, a2, b1);
	        // n????????????b1??????????????¢???????????????a????????´??§???????????§???
	        // ????????????a????????????????????????????????¢???????????¢??????????????¨??????
	        return distancePlaneP(b1, n, a1);
	    }


	    static Point[] crosspointLSphere(Point a1, Point a2, Point c, double r) {
	        Point foot = projectOnLine(a1, a2, c);
	        double footLenSqr = foot.distanceSqr(c);
	        Point dir = a2.subtract(a1);
	        if (approxEquals(r * r, footLenSqr)) {  // ????????§??\????????´???????????????????????????????????????
	            return new Point[] { foot };
	        }
	        if (r * r < footLenSqr) return new Point[0];

	        double len = Math.sqrt(r * r - footLenSqr) / dir.distance();
	        dir = dir.multiply(len);
	        return new Point[] { foot.add(dir), foot.subtract(dir), };
	    }
	     
	    static boolean intersectSC(Point p1, Point p2, Point cP, int rP) {
	        return distanceSP(p1,p2, cP) < rP + EPS;
	    }


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
    	if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
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