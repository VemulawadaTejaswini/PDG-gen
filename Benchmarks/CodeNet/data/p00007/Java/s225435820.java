import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double debt = 100000;
		int week = scan.nextInt();
		double kinri = Math.pow(1.05, week);
		
		debt = debt * kinri;
		BigDecimal bd = new BigDecimal(debt);
		bd = bd.setScale(-4, BigDecimal.ROUND_UP);
		int ans = bd.intValue();
		
		System.out.println(ans);
	}
}