import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		try {
			//Input
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			String[] num;
			position pos = new position("0", "0", 90);

			while ((str = br.readLine()) != null) {
				num = str.split(",", 0);
				if ((Integer.parseInt(num[0]) == 0) && (Integer.parseInt(num[1]) == 0)) {
					break;
				} else {
					BigDecimal dis = new BigDecimal(num[0]);
					int deg = Integer.parseInt(num[1]);
					pos.move(dis, deg);
				}
			}
			//Output
			System.out.println(pos.x.intValue());
			System.out.println(pos.y.intValue());
		} catch (Exception e) {
			System.out.println("error");
		}

	}

}

class position {
	BigDecimal x;
	BigDecimal y;
	int degree;

	public position (String a, String b, int c) {
		this.x = new BigDecimal(a);
		this.y = new BigDecimal(b);
		this.degree = c;
	}

	public void move (BigDecimal dis, int deg) {
		double sin = Math.sin(Math.toRadians(this.degree));
		double cos = Math.cos(Math.toRadians(this.degree));
		BigDecimal move_x = new BigDecimal(dis.multiply(BigDecimal.valueOf(cos)).toPlainString());
		BigDecimal move_y = new BigDecimal(dis.multiply(BigDecimal.valueOf(sin)).toPlainString());
		this.x = this.x.add(move_x);
		this.y = this.y.add(move_y);
		this.degree = this.degree - deg;
	}
}