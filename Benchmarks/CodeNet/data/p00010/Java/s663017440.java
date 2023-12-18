import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;



public class Main {

	public static void main(String[] args) throws IOException {
		//input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		str = br.readLine();
		int N = Integer.parseInt(str);
		int scale = 3;

		for (int i = 0; i < N; i++) {
			str = br.readLine();
			//Get point
			String[] num = str.split(" ", 0);
			point P = new point(num[0], num[1]);
			point Q = new point(num[2], num[3]);
			point R = new point(num[4], num[5]);

			//Get vector
			vector PQ = new vector(P, Q);
			vector PR = new vector(P, R);
			BigDecimal half_length = new BigDecimal(vector_length(PQ).toPlainString());
			half_length = half_length.divide(new BigDecimal("2"), BigDecimal.ROUND_HALF_UP);

			//Get unit_vector
			unit_vector uPQ = new unit_vector(PQ);
			unit_vector uPR = new unit_vector(PR);

			//Get center from PQ
			BigDecimal temp_x = new BigDecimal(coefficient(PQ, PR).multiply(uPQ.unit_vy).toPlainString());
			BigDecimal temp_y = new BigDecimal(coefficient(PQ, PR).multiply(uPQ.unit_vx).toPlainString());
			point O = new point(uPQ.unit_vx.multiply(half_length).add(temp_x), uPQ.unit_vy.multiply(half_length).subtract(temp_y));

			//Get radius
			vector OP = new vector(O, P);
			BigDecimal rad = new BigDecimal(vector_length(OP).toPlainString());
			rad = rad.setScale(3, BigDecimal.ROUND_HALF_UP);

			System.out.println(O.x.setScale(3, BigDecimal.ROUND_HALF_UP) + " " + O.y.setScale(3, BigDecimal.ROUND_HALF_UP) + " " + rad);
		}

	}

	static BigDecimal dot_vector (vector a, vector b) {
		BigDecimal dot = new BigDecimal(a.vx.toPlainString());
		dot = dot.multiply(b.vx);
		BigDecimal tmp = new BigDecimal(a.vy.toPlainString());
		tmp = tmp.multiply(b.vy);
		dot = dot.add(tmp);
		return dot;
	}

	static BigDecimal vector_length (vector a) {
		BigDecimal length_x = new BigDecimal(a.vx.multiply(a.vx).toPlainString());
		BigDecimal length_y = new BigDecimal(a.vy.multiply(a.vy).toPlainString());
		BigDecimal length_2 = new BigDecimal(length_x.add(length_y).toPlainString());
		BigDecimal length = new BigDecimal(Math.sqrt(length_2.doubleValue()), MathContext.DECIMAL64);
		return length;
	}

	static BigDecimal coefficient (vector a, vector b) {
		BigDecimal XaXb = new BigDecimal(a.vx.multiply(b.vx).toPlainString());
		BigDecimal YaYb = new BigDecimal(a.vy.multiply(b.vy).toPlainString());
		BigDecimal Xb2 = new BigDecimal(b.vx.multiply(b.vx).toPlainString());
		BigDecimal Yb2 = new BigDecimal(b.vy.multiply(b.vy).toPlainString());
		BigDecimal XaYb = new BigDecimal(a.vx.multiply(b.vy).toPlainString());
		BigDecimal XbYa = new BigDecimal(b.vx.multiply(a.vy).toPlainString());
		BigDecimal tmp = new BigDecimal(XaYb.subtract(XbYa).toPlainString());
		BigDecimal co = new BigDecimal(XaXb.add(YaYb).toPlainString());
		co = co.subtract(Xb2); co = co.subtract(Yb2); co = co.divide(tmp, 5, BigDecimal.ROUND_HALF_UP);
		return co;
	}
}

//Definition of point
class point {
	BigDecimal x;
	BigDecimal y;

	public point (String a, String b) {
		this.x = new BigDecimal(a);
		this.y = new BigDecimal(b);
	}

	public point (BigDecimal a, BigDecimal b) {
		this.x = new BigDecimal(a.toPlainString());
		this.y = new BigDecimal(b.toPlainString());
	}
}

//Definition of vector
 class vector {
	BigDecimal vx;
	BigDecimal vy;

	public vector (point a, point b) {
		this.vx = new BigDecimal(b.x.toPlainString());
		vx = vx.subtract(a.x);
		this.vy = new BigDecimal(b.y.toPlainString());
		vy = vy.subtract(a.y);
	}
	public vector (BigDecimal p, BigDecimal q) {
		this.vx = new BigDecimal(p.toPlainString());
		this.vy = new BigDecimal(q.toPlainString());
	}
}

 class unit_vector {
	 BigDecimal unit_vx;
	 BigDecimal unit_vy;

	 public unit_vector (vector a) {
		 BigDecimal length_x = new BigDecimal(a.vx.multiply(a.vx).toPlainString());
		 BigDecimal length_y = new BigDecimal(a.vy.multiply(a.vy).toPlainString());
		 BigDecimal length_2 = new BigDecimal(length_x.add(length_y).toPlainString());
		 BigDecimal length = new BigDecimal(Math.sqrt(length_2.doubleValue()), MathContext.DECIMAL64);

		 this.unit_vx = a.vx.divide(length, 5, BigDecimal.ROUND_HALF_UP);
		 this.unit_vy = a.vy.divide(length, 5, BigDecimal.ROUND_HALF_UP);
	 }
 }