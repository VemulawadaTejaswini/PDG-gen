
import java.io.*;
import java.util.*;


// æ­Ôá¤Æ±ëB
// âè¶É¢ÄÈ­ÄàâèZbgÍ¡Åæªª0ÅI¹Å éB
// âèZbgÌJèÔµÉú»Rê

// 2011/10/17

//@2016 v[ÌÄõ
public class Main {

	class Double2 {
		
		public double x, y;
		
		public Double2() {/**/}
		public Double2( double xx, double yy ) { x=xx; y=yy; }
		public Double2( Double2 s ) { x=s.x; y=s.y; }

		public double length2() {
			return x*x + y*y;
		}

		public double length() {
			return Math.sqrt(x * x + y * y);
		}
		public double length(Double2 d2) {
			return Math.sqrt((d2.x - x) * (d2.x - x) + (d2.y - y) * (d2.y - y));
		}
	
		/* (ñ Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return String.format("[%g %g]", x, y);
		}
	}
	
	
	// A§ûö®ðð­
	private double[] houteisiki(double a, double b, double c, double d, double e, double f) {
	
		double r = (a * d - b * c);
		if (r == 0)
			return null; // ðÈµ
		r = 1 / r;
		double na = r * d;
		double nb = -r * b;
		double nc = -r * c;
		double nd = r * a;
		
		double x = na * e + nb * f;
		double y = nc * e + nd * f;
		
		return new double[] { x, y };
	}
	
	double v1; // nãÌ¬³
	double v2; // Ì¬³
	
	// x0y0-x1y1 Ó tx,ty ÚWn_
	// üÜ_
	// sign  1 or -1
	// ðªÈ¢Æ«Ínull
	private Double2 sub(Double2 p0, Double2 p1, Double2 t, double sign) {
		
		double bx = p1.x - p0.x;
		double by = p1.y - p0.y;
		
		// ñ]px
		double cos = v2 / v1;
		double sin = Math.sqrt(1 - cos * cos) * sign;
		
		// ñ]ãÌxNg
		double kx = cos * bx - sin * by;
		double ky = sin * bx + cos * by;
		
		//System.out.printf("kxky=%f %f\n", kx, ky);
		
		double a = by;
		double b = -bx;
		double e = a* p0.x + b* p0.y;
		double c = ky;
		double d = -kx;
		double f = c* t.x + d* t.y; 

		double[] ret = houteisiki(a, b, c, d, e, f);
		if (ret == null)
			return null;
		Double2 p = new Double2(ret[0], ret[1]);
		return p;
	}
	
	
	
	// x0y0-x1y1 Ó tx,ty ÚWn_
	// ÔðÔ·
	private double sub2(double x0, double y0, double x1, double y1, double tx, double ty) {
		
		double bx = x1 - x0;
		double by = y1 - y0;
		
		// ñ]px
		double cos = v2 / v1;
		double sin = Math.sqrt(1 - cos * cos);
		
		// ñ]ãÌxNg
		double kx = cos * bx - sin * by;
		double ky = sin * bx + cos * by;
		
		//System.out.printf("kxky=%f %f\n", kx, ky);
		
		double a = by;
		double b = -bx;
		double e = a*x0 + b*y0;
		double c = ky;
		double d = -kx;
		double f = c*tx + d*ty; 

		
		// _CNg
		double t1 = Math.sqrt((x0-tx)*(x0-tx) + (y0-ty)*(y0-ty)) / v2;

		double[] ret = houteisiki(a, b, c, d, e, f);
		
		if (ret == null) {
			System.out.printf("¼Ú%f \n", t1);
			return t1;
		}
		else {
		
			double x = ret[0];
			double y = ret[1];
			
			
			System.out.printf("ð_=%f %f\n", x, y);
			
	
			// Óð½ÇÁÄ©ç
			double t2 = Math.sqrt((x0-x)*(x0-x) + (y0-y)*(y0-y)) / v1 +
						 Math.sqrt((tx-x)*(tx-x) + (ty-y)*(ty-y)) / v2;
			
			System.out.printf("¼Ú%f üÜ%f\n", t1, t2);
			return Math.min(t1, t2);
		}
		
	}
	
	
	
	// C return falseÅ¨µÜ¢
	boolean main(BufferedReader reader) throws IOException {

		//List<Bar> list = new ArrayList<Bar>();

		String s = reader.readLine();
		String[] sp = s.split(" ");
		int N = Integer.parseInt(sp[0]);
		if (N == 0)
			return false;

		// ½p`Ì¸_
		int[] tx = new int[N];
		int[] ty = new int[N];
		
		s = reader.readLine();
		sp = s.split(" ");
		for(int i = 0; i < N; i++) {
			tx[i] = Integer.parseInt(sp[i * 2 + 0]);
			ty[i] = Integer.parseInt(sp[i * 2 + 1]);
		}
		s = reader.readLine();
		int tg = Integer.parseInt(s); // nãÌ¬³Ìt
		v1 = 1. / tg;
		s = reader.readLine();
		int tw = Integer.parseInt(s); // Ì¬³Ìt
		v2 = 1. / tw;
		s = reader.readLine();
		sp = s.split(" ");
		int xs = Integer.parseInt(sp[0]); // ÄõÊu
		int ys = Integer.parseInt(sp[1]);
		s = reader.readLine();
		sp = s.split(" ");
		int xt = Integer.parseInt(sp[0]); // ­Êu
		int yt = Integer.parseInt(sp[1]);

		
		// ÄõÍÇÌÓãÉ¢é©H
		int i;
		for(i = 0; i < N; i++) {
			if ((tx[(i+1)%N] - xs) * (ty[i] - ys) == (tx[i] - xs) * (ty[(i+1)%N] - ys)) {
				break;
			}
		}
		int on = i;
		assert on < N;
		//System.out.printf("on=%d\n", on); 
		
		//@½p`f[^ìè¼µ 
		Double2[] t2 = new Double2[N + 2];
		t2[0] = new Double2();
		t2[N + 1] = new Double2();
		t2[0].x = t2[N + 1].x = xs;
		t2[0].y = t2[N + 1].y = ys;
		for(i = 0; i < N; i++) {
			t2[i + 1] = new Double2();
			t2[i + 1].x = tx[(on + 1 + i) % N];
			t2[i + 1].y = ty[(on + 1 + i) % N];
		}

		
		Double2 s1 = new Double2(xs, ys);
		Double2 s2 = new Double2(xt, yt);

		// _CNg
		double min = s1.length(s2) / v2;
		
	//	double min = Double.MAX_VALUE;
		for(i = 0; i < N + 1; i++) {
			Double2 h0 = t2[i];
			Double2 h1 = t2[i+1];

			Double2 p11 = sub(h0, h1, s1, 1);
			//System.out.printf("üÜ_%s\n", p11);
			Double2 p12 = sub(h0, h1, s1, -1);
			//System.out.printf("üÜ_%s\n", p12);
			Double2 p21 = sub(h0, h1, s2, 1);
			//System.out.printf("üÜ_%s\n", p21);
			Double2 p22 = sub(h0, h1, s2, -1);
			//System.out.printf("üÜ_%s\n", p22);

			if (p11 == null || p12 == null || p21 == null || p22 == null)
				continue;
			
			double len = 99999999;
			if (p11 != null && p21 != null)
				len = Math.min(len, p11.length(p21));
			if (p11 != null && p22 != null)
				len = Math.min(len, p11.length(p22));
			if (p12 != null && p21 != null)
				len = Math.min(len, p12.length(p21));
			if (p12 != null && p22 != null)
				len = Math.min(len, p12.length(p22));
			//System.out.printf("len=%f\n", len);
		
			double t = len / v1 + (s1.length(p11) + s2.length(p21)) / v2;
			//System.out.printf("t=%f\n", t);

			min = Math.min(min, t);
			
		}		
		System.out.printf("%.10f\n", min);
		
//		double min = Double.MAX_VALUE;
//		double tr = 0; // ÝÏÔ
//			System.out.printf("tx2 %f %f\n", tx2[i], ty2[i]);
//			
//			double t = tr + sub(tx2[i], ty2[i], tx2[i+1], ty2[i+1], xt, yt);
//			System.out.printf("t=%f\n", t);
//			min = Math.min(min, t);
//			
//			tr += Math.sqrt((tx2[i] -tx2[i+1])*(tx2[i] -tx2[i+1])+(ty2[i] -ty2[i+1])*(ty2[i] -ty2[i+1])) / v1;
//		}
//		
//		System.out.printf("%.10f\n", min);
		
		return true;
	}
	
	
	public static void main(String[] args) throws IOException {

//		String inputStr = "4\n0 0 10 0 10 10 0 10\n10\n12\n0 5\n9 5\n0\n";
//		String inputStr = "4\n0 0 10 0 10 10 0 10\n10\n12\n0 0\n9 1\n0\n";
//		String inputStr = "4\n0 0 10 0 10 10 0 10\n10\n12\n0 1\n9 1\n0\n";
//		String inputStr = "8\n2 0 4 0 6 2 6 4 4 6 2 6 0 4 0 2\n10\n12\n3 0\n3 5\n0\n";

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedReader reader = new BufferedReader(new StringReader(inputStr));

		for(int loop = 0;; loop++) {
			boolean b = new Main().main(reader);
			if (!b)
				break;
		}		
		
		reader.close();
	}

}