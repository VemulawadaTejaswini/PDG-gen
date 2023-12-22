import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] str = s.split(" ");
		BigDecimal[] big  = new BigDecimal[4];
		for (int i = 0; i < 4; i++) {
			big[i] = new BigDecimal(str[i]);
		}

		BigDecimal x = big[0].subtract(big[2]);
		BigDecimal y = big[1].subtract(big[3]);
		
		//BigDecimal l = x.multiply(x).add(y.multiply(y));
		
		//int[] in  = new int[4];
		//for (int i = 0; i < 4; i++) {
		//	in[i] = Integer.parseInt(str[i]);
		//}
		
		//int x = in[0] - in[2];
		//int y = in[1] - in[3];
		
		//System.out.println(Math.sqrt(x*x+y*y));

		double dx = x.doubleValue();
		double dy = y.doubleValue();
		
		System.out.println(Math.sqrt(dx*dx+dy*dy));
	}

}