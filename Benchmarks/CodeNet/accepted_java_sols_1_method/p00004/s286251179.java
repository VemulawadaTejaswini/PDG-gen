import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) throws IOException {
		//??????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = br.readLine()) != null){
			String[] num = str.split(" ", 0);
			//?????°?¨????
			BigDecimal d = new BigDecimal(num[3]);
			BigDecimal e = new BigDecimal(num[4]);
			BigDecimal f = new BigDecimal(num[5]);

			//?¨????
			BigDecimal ce = new BigDecimal(num[2]);
			ce = ce.multiply(e);
			BigDecimal bf = new BigDecimal(num[1]);
			bf = bf.multiply(f);
			BigDecimal ae = new BigDecimal(num[0]);
			ae = ae.multiply(e);
			BigDecimal bd = new BigDecimal(num[1]);
			bd = bd.multiply(d);
			BigDecimal cd = new BigDecimal(num[2]);
			cd = cd.multiply(d);
			BigDecimal af = new BigDecimal(num[0]);
			af = af.multiply(f);

			BigDecimal x_numer = new BigDecimal(ce.toPlainString());
			x_numer = x_numer.subtract(bf);
			BigDecimal x_denom = new BigDecimal(ae.toPlainString());
			x_denom = x_denom.subtract(bd);
			BigDecimal x = new BigDecimal("0.000");
			x = x.add(x_numer);
			x = x.divide(x_denom, 3, BigDecimal.ROUND_HALF_UP);

			BigDecimal y_numer = new BigDecimal(cd.toPlainString());
			y_numer = y_numer.subtract(af);
			BigDecimal y_denom = new BigDecimal(bd.toPlainString());
			y_denom = y_denom.subtract(ae);
			BigDecimal y = new BigDecimal("0.000");
			y = y.add(y_numer);
			y = y.divide(y_denom, 3, BigDecimal.ROUND_HALF_UP);

			//??????
			System.out.println(x + " " + y);
		}
	}

}