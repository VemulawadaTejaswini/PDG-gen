import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double[] d = new double[6];
		double ans_x;
		double ans_y;
		double tmp_a1;
		double tmp_b1;
		double tmp_c1;
		double tmp_a2;
		double tmp_b2;
		double tmp_c2;
		double tmp_r;
		double ans_r;
		
		Scanner scanner = new Scanner(System.in);
		int dset = scanner.nextInt();

		for( int i=0; i<dset; i++){
			for(int j=0; j<6; j++){
				d[j] = scanner.nextDouble();
			}
			tmp_a1 = 2 * (d[2] - d[0]);
			tmp_b1 = 2 * (d[3] - d[1]);
			tmp_c1 = Math.pow(d[0], 2) - Math.pow(d[2], 2) + Math.pow(d[1], 2) - Math.pow(d[3], 2);
			tmp_a2 = 2 * (d[4] - d[0]);
			tmp_b2 = 2 * (d[5] - d[1]);
			tmp_c2 = Math.pow(d[0], 2) - Math.pow(d[4], 2) + Math.pow(d[1], 2) - Math.pow(d[5], 2);
			
			ans_x = ( tmp_b1 * tmp_c2 - tmp_b2 * tmp_c1 ) / ( tmp_a1 * tmp_b2 - tmp_a2 * tmp_b1 );
			ans_y = ( tmp_c1 * tmp_a1 - tmp_c2 * tmp_a1 ) / ( tmp_a1 * tmp_b2 - tmp_a2 * tmp_b1 );
			tmp_r = Math.sqrt( Math.pow((ans_x - d[0]), 2) + Math.pow((ans_y - d[1]), 2));
			ans_r = new BigDecimal(tmp_r).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
			
			System.out.printf("%.3f %.3f %.3f", ans_x, ans_y, ans_r);
			System.out.println();
			
		}
	}
}