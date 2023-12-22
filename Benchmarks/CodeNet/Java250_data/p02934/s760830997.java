import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		BigDecimal nums[] = new BigDecimal[n];
		for(int i=0; i<n; i++) {
			nums[i]=new BigDecimal(sc.nextInt());
		}
		
		BigDecimal molecule = new BigDecimal(1);
		for(int i=0; i<n; i++) {
			molecule=molecule.multiply(nums[i]);
		}
		
		BigDecimal denominator = new BigDecimal(0);
		
		for(int i=0; i<n; i++) {
			denominator=denominator.add(molecule.divide(nums[i]));
		}

		System.out.println(molecule.divide(denominator, 10, BigDecimal.ROUND_HALF_UP));

	}
}