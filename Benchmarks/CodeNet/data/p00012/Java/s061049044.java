import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) throws IOException {
		//input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while ((str = br.readLine()) != null) {

			//Get point
			String[] num = str.split(" ", 0);
			point O = new point(num[0], num[1]);
			point A = new point(num[2], num[3]);
			point B = new point(num[4], num[5]);
			point P = new point(num[6], num[7]);

			//Get vector
			vector OA = new vector(O, A);
			vector OB = new vector(O, B);
			vector OP = new vector(O, P);

			//Calculation of coefficient
			BigDecimal XaYb = new BigDecimal(OA.vx.multiply(OB.vy).toPlainString());
			BigDecimal XbYa = new BigDecimal(OA.vy.multiply(OB.vx).toPlainString());
			BigDecimal XaPy = new BigDecimal(OA.vx.multiply(OP.vy).toPlainString());
			BigDecimal XbPy = new BigDecimal(OB.vx.multiply(OP.vy).toPlainString());
			BigDecimal YaPx = new BigDecimal(OA.vy.multiply(OP.vx).toPlainString());
			BigDecimal YbPx = new BigDecimal(OB.vy.multiply(OP.vx).toPlainString());

			BigDecimal temp_s = new BigDecimal(YbPx.subtract(XbPy).toPlainString());
			BigDecimal temp_t = new BigDecimal(XaPy.subtract(YaPx).toPlainString());
			BigDecimal XaYb_YaXb = new BigDecimal(XaYb.subtract(XbYa).toPlainString());

			BigDecimal co_S = new BigDecimal(temp_s.toPlainString());
			co_S = co_S.divide(XaYb_YaXb, 3, BigDecimal.ROUND_HALF_UP);
			BigDecimal co_T = new BigDecimal(temp_t.toPlainString());
			co_T = co_T.divide(XaYb_YaXb, 3, BigDecimal.ROUND_HALF_UP);

			BigDecimal total = new BigDecimal(co_S.add(co_T).toPlainString());

			if ((co_S.compareTo(BigDecimal.ZERO) >= 0) && (co_T.compareTo(BigDecimal.ZERO) >= 0)) {
				if ((total.compareTo(BigDecimal.ZERO) >= 0) && (total.compareTo(BigDecimal.ONE) <= 0)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
		}

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