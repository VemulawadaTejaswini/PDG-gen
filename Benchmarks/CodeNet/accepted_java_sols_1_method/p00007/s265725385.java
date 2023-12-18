import java.math.BigDecimal;
import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		double s = 100000;
		double sa = 0;
		for(int i = 1;i <= n;i++){
			s = s + s*0.05;
			s = s / 1000;
			BigDecimal bi = new BigDecimal(String.valueOf(s));
			sa = bi.setScale(0,BigDecimal.ROUND_UP).doubleValue();
			sa = sa*1000;
			s = sa;
		}
		System.out.println((int)sa);
		System.exit(0);
	}
}