
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num = 100000;
		int syuu = 0;
		double goukei = 0;
		double risi = 0;

		Scanner scan = new Scanner(System.in);
		syuu = scan.nextInt();
		for (int i = 0 ; i < syuu ; i++){
			risi = num * 0.05;
			num = num + (int)risi;
			risi = 0;
			BigDecimal bd = new BigDecimal(num);
			bd = bd.setScale(-3, BigDecimal.ROUND_UP);

			num = (int)bd.doubleValue();
		}
		//BigDecimal bd = new BigDecimal(num);
		//bd = bd.setScale(-3, BigDecimal.ROUND_UP);

		//num = (int)bd.doubleValue();
		System.out.println(num);
		
	}

}