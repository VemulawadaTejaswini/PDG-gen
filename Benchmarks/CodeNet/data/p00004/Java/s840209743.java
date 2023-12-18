import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()){
			double a = stdIn.nextDouble();
			double b = stdIn.nextDouble();
			double c = stdIn.nextDouble();
			double d = stdIn.nextDouble();
			double e = stdIn.nextDouble();
			double f = stdIn.nextDouble();

			double x = 0.0;
			double y = 0.0;

			//aとdをそれぞれ a,d の公倍数になるように掛ける
			if(a != d){
				double temp1 = a;
				a *= d;
				b *= d;
				c *= d;
				d *= temp1;
				e *= temp1;
				f *= temp1;
			}
			double temp2 = b - e;
			double temp3 = c - f;

			y = temp3 / temp2;

			x = (c - b * y) / a;

			//小数第四位で四捨五入
			BigDecimal bi = null;
			bi = new BigDecimal(String.valueOf(x));
			x = bi.setScale(4,BigDecimal.ROUND_HALF_UP).doubleValue();
			bi = new BigDecimal(String.valueOf(y));
			y = bi.setScale(4,BigDecimal.ROUND_HALF_UP).doubleValue();

			System.out.printf( "%.3f %.3f\n",x,y);
		}
	}
}