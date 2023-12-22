import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int min = stdIn.nextInt();
		int max = min;
		BigDecimal sum = new BigDecimal(min);
		for(int i=0;i<n-1;i++){
			int t = stdIn.nextInt();
			min = Math.min(min, t);
			max = Math.max(max, t);
			sum = sum.add(new BigDecimal(t));
		}
		System.out.println(min+" "+max+" "+sum);
	}
}