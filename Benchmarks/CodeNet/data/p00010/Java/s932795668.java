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
			//BigDecimal half_length = new BigDecimal(vector_length(PQ).toPlainString());
			//half_length = half_length.divide(new BigDecimal("2.0000"),5 , BigDecimal.ROUND_HALF_UP);

			//Get unit_vector
			//unit_vector uPQ = new unit_vector(PQ);

			//Get center from P
			BigDecimal Xa2 = new BigDecimal(PQ.vx.multiply(PQ.vx).toPlainString());
			BigDecimal Ya2 = new BigDecimal(PQ.vy.multiply(PQ.vy).toPlainString());
			BigDecimal Xb2 = new BigDecimal(PR.vx.multiply(PR.vx).toPlainString());
			BigDecimal Yb2 = new BigDecimal(PR.vy.multiply(PR.vy).toPlainString());
			BigDecimal XaYb = new BigDecimal(PQ.vx.multiply(PR.vy).toPlainString());
			BigDecimal XbYa = new BigDecimal(PR.vx.multiply(PQ.vy).toPlainString());

			BigDecimal Xa2Ya2 = new BigDecimal(Xa2.add(Ya2).toPlainString());
			BigDecimal Xb2Yb2 = new BigDecimal(Xb2.add(Yb2).toPlainString());
			BigDecimal XaYb_XbYa = new BigDecimal(XaYb.subtract(XbYa).toPlainString());
			BigDecimal XaYb_XbYa_x2 = new BigDecimal("0");
			XaYb_XbYa_x2 = XaYb_XbYa.multiply(new BigDecimal("2")).setScale(5,  BigDecimal.ROUND_HALF_UP);

			BigDecimal temp_x1 = new BigDecimal("0");
			temp_x1 = temp_x1.add(PR.vy.multiply(Xa2Ya2)).setScale(5, BigDecimal.ROUND_HALF_UP);
			BigDecimal temp_x2 = new BigDecimal("0");
			temp_x2 = temp_x2.add(PQ.vy.multiply(Xb2Yb2)).setScale(5, BigDecimal.ROUND_HALF_UP);
			BigDecimal temp_x = new BigDecimal(temp_x1.subtract(temp_x2).toPlainString());
			temp_x = temp_x.divide(XaYb_XbYa_x2, 3, BigDecimal.ROUND_HALF_UP);

			BigDecimal temp_y1 = new BigDecimal("0");
			temp_y1 = temp_y1.add(PQ.vx.multiply(Xb2Yb2)).setScale(5, BigDecimal.ROUND_HALF_UP);
			BigDecimal temp_y2 = new BigDecimal("0");
			temp_y2 = temp_y2.add(PR.vx.multiply(Xa2Ya2)).setScale(5, BigDecimal.ROUND_HALF_UP);
			BigDecimal temp_y = new BigDecimal(temp_y1.subtract(temp_y2).toPlainString());
			temp_y = temp_y.divide(XaYb_XbYa_x2, 3, BigDecimal.ROUND_HALF_UP);

			point O = new point(temp_x.add(P.x), temp_y.add(P.y));



			//Get radius
			vector OP = new vector(O, P);
			BigDecimal rad = new BigDecimal(vector_length(OP).toPlainString());
			rad = rad.setScale(scale, BigDecimal.ROUND_HALF_UP);

			System.out.println(O.x + " " + O.y + " " + rad);
			
		}

	}

	static BigDecimal vector_length (vector a) {
		BigDecimal length_x = new BigDecimal(a.vx.multiply(a.vx).toPlainString());
		BigDecimal length_y = new BigDecimal(a.vy.multiply(a.vy).toPlainString());
		BigDecimal length_2 = new BigDecimal(length_x.add(length_y).toPlainString());
		BigDecimal length = new BigDecimal(Math.sqrt(length_2.doubleValue()), MathContext.DECIMAL64);
		return length;
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