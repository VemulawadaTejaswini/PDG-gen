

import java.math.BigDecimal;
import java.util.Scanner;

public class Main{




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a[] = new double[6];
		double x,y;
		double num;

		while(sc.hasNext()){
			for (int i = 0; i < 6; i++) {
				a[i] = sc.nextDouble();
			}

			if(a[0] != a[3]){
				num = a[0];
				a[0] *= a[3];
				a[1] *= a[3];
				a[2] *= a[3];

				a[3] *= num;
				a[4] *= num;
				a[5] *= num;

			}

			if((a[0] > 0 && a[3] > 0) || (a[0] < 0 && a[3] < 0)){
				a[3] *= (-1);
				a[4] *= (-1);
				a[5] *= (-1);

			}
			y = (a[2] + a[5])/(a[1] + a[4]);
			x = (a[2] - a[1] * y)/a[0];

			BigDecimal new_x = new BigDecimal(x);
			BigDecimal new_y = new BigDecimal(y);

			BigDecimal a_x = new_x.setScale(3, BigDecimal.ROUND_HALF_UP);
	        BigDecimal a_y = new_y.setScale(3, BigDecimal.ROUND_HALF_UP);

			System.out.println(a_x+" "+a_y);

		}
	}

}