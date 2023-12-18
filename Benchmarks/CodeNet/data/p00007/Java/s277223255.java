import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int week = scan.nextInt();
		double kinri = Math.pow(1.05, week);
		
		
		double debt = 10000 * Math.ceil(10*kinri);
		int ans = (int)debt;
		
		System.out.println(ans);
	}
}