import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int week = sc.nextInt();
		double debt = 100000;
		for(int i = 0 ; i < week ; i++){
			debt = debt * 1.05;
		}
		BigDecimal ans = new BigDecimal(debt);
		ans = ans.setScale(-4,BigDecimal.ROUND_UP);
		System.out.printf("%.0f",ans);
		sc.close();
	}

}