import java.awt.geom.Point2D;
import java.io.*;
import java.math.*;
import java.util.*;
import java.util.Map.*;







class Main {

	public static void main(String[] args) {	
		//FastScanner sc = new FastScanner();
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();
		for(int datasetCount = 0; datasetCount < dataset; datasetCount++) {
			int xa = sc.nextInt();
			int ya = sc.nextInt();
			int xb = sc.nextInt();
			int yb = sc.nextInt();
			int n = sc.nextInt();
			Point pa = new Point(xa,ya);
			Point pb = new Point(xb,yb);
			Data[] data = new Data[n];
			for(int i = 0; i < n; i++) {
				Point s = new Point(sc.nextInt(),sc.nextInt());
				Point t = new Point(sc.nextInt(),sc.nextInt());
				data[i] = new Data(s,t,(sc.nextInt()==1?true:false),(sc.nextInt()==1?true:false));
			}
			PriorityQueue<Data> intersectA = new PriorityQueue<Data>();
			PriorityQueue<Data> intersectB = new PriorityQueue<Data>();
			for(int i = 0; i < n; i++) {
				if(intersectsSS(pa,pb,data[i].s,data[i].t)) {
					Point pp = crosspointLL(data[i].s,data[i].t,pa,pb);
					double dist = pa.distance(pp);
					data[i].dist = dist;
					intersectA.add(data[i]);
					intersectB.add(data[i]);
				}
			}
			int max = 0;
			boolean nowg = true;
			while(!intersectA.isEmpty()) {
				Data p = intersectA.poll();
				if(p.o) {
					if(p.l != nowg) {
						max++;
						nowg = !nowg;
					}
				}
				else {
					if(p.l == nowg) {
						max++;
						nowg = !nowg;
					}
				}
			}
			int count = 0;
			nowg = false;
			while(!intersectB.isEmpty()) {
				Data p = intersectB.poll();
				if(p.o) {
					if(p.l != nowg) {
						count++;
						nowg = !nowg;
					}
				}
				else {
					if(p.l == nowg) {
						count++;
						nowg = !nowg;
					}
				}
			}
			max = Math.min(max, count);
			System.out.println(max);
			
			
			
			
		}
		
		
	}
	static Point crosspointLL(Point a1, Point a2, Point b1, Point b2) {
        // ????????????a????????????d1/d2???????????¨??´???b?????\???????????????d1,d2????¨????
        Point a = a2.subtract(a1);
        Point b = b2.subtract(b1);
        double d1 = b.cross(b1.subtract(a1));
        double d2 = b.cross(a);
        if (Math.abs(d1) < EPS && Math.abs(d2) < EPS) return a1;  // same line
        // ????????´?????????????????????????????????????????? return intersectsSP(b1,b2,a1) ? a1 : a2; ??¨??????????????????
        if (Math.abs(d2) < EPS) throw new IllegalArgumentException(
                "PRECONDITION NOT SATISFIED");
        return a1.add(a.multiply(d1 / d2));
    }
	static class Data implements Comparable<Data> {
		static Point pp;
		Point s;
		Point t;
		boolean o;
		boolean l;
		double dist;
		Data(Point s, Point t, boolean o, boolean l) {
			this.s = s;
			this.t = t;
			this.o = o;
			this.l = l;
		}
		@Override
		public int compareTo(Data o) {
			if(this.dist < o.dist) return -1;
			if(this.dist > o.dist) return 1;
			return 0;
		}
	}
	static double distanceSP(Point a1, Point a2, Point b) {
        Point r = projection(a1, a2, b);
        // ?????±??????????????????????????????????????????p??????????????????????????¢???????????°??????
        if (intersectsSP(a1, a2, r)) return r.distance(b);
        return Math.min(b.distance(a1), b.distance(a2));
    }
	static boolean intersectsSP(Point a1, Point a2, Point b) {
        return ccw(a1, a2, b) == 0;
    }
	static Point projection(Point a1, Point a2, Point p) {
        Point a = a2.subtract(a1);
        p = p.subtract(a1);
        double t = a.dot(p) / a.distanceSqr();
        // |a||p|cos??=t|a|^2, a,t???????????§?????????????¨?????????p??????????????´???
        return a1.add(a.multiply(t));
    }
	static class Point extends Point2D.Double implements Comparable<Point> {

        public Point() {
        }

        public Point(double x, double y) {
            super(x, y);
            // x??¨y???final??§??????????????????????????????????????¢??°????????¨????????´?????????????????¨???????????¨?????????????????§??¨??????
        }

        /** ?????????dot(v1,v2)=|v1||v2|cos?? */
        double dot(Point p) {
            return x * p.x + y * p.y;
        }

        /** ?????????cross(v1,v2)=|v1||v2|sin?? */
        double cross(Point p) {
            return x * p.y - y * p.x;
        }

        double distanceSqr() {
            return x * x + y * y;
        }

        double distance() {
            return Math.hypot(x, y);
        }

        Point add(Point p) {
            return new Point(x + p.x, y + p.y);
        }

        Point multiply(double k) {
            return new Point(k * x, k * y);
        }

        Point multiply(Point p) {  // complex mul: (x+yi)*(p.x+p.yi)
            return new Point(x * p.x - y * p.y, x * p.y + p.x * y);
        }

        Point subtract(Point p) {
            return new Point(x - p.x, y - p.y);
        }

        @Override
        public boolean equals(Object obj) {  // ????????¢??°???Eclipse??§??????????????§?¨?????????????????????????????????°??????
            if (this == obj) return true;
            if (obj == null) return false;
            if (getClass() != obj.getClass()) return false;
            Point other = (Point) obj;
            if (!approxEquals(x, other.x)) return false;
            if (!approxEquals(y, other.y)) return false;
            return true;
        }

        @Override
        public int compareTo(Point o) {
            if (!approxEquals(x, o.x)) return (int) Math.signum(x - o.x);
            if (!approxEquals(y, o.y)) return (int) Math.signum(y - o.y);
            return 0;
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }

    }
	
	static boolean approxEquals(double a, double b) {
        return Math.abs(a - b) < EPS;
    }
	
	static final double EPS = 1e-12;
	static boolean intersectsSS(Point a1, Point a2, Point b1, Point b2) {
	       // ????????????????????????????????????????????????????????????true
	       return ccw(a1, a2, b1) * ccw(a1, a2, b2) <= 0
	               && ccw(b1, b2, a1) * ccw(b1, b2, a2) <= 0;
	}
	 
	 static int ccw(Point a, Point b, Point c) {
	        b = b.subtract(a);
	        c = c.subtract(a);
	        if (b.cross(c) > EPS) return +1;                  // counter clockwise
	        if (b.cross(c) + EPS < 0) return -1;              // clockwise
	        if (b.dot(c) + EPS < 0) return +2;                // c--a--b on line and a!=c
	        if (b.distanceSqr() < c.distanceSqr()) return -2; // a--b--c on line or a==b???????????¬??????a==b??¨??????????????§?????????
	        return 0;                                         // a--c--b on line or b==c
	    }


	
	static class FastScanner {
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
}