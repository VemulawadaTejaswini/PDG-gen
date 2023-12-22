import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
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

		Arrays.sort(nums, Collections.reverseOrder());

		BigDecimal denominator = new BigDecimal(Math.pow(2, n-1));

		BigDecimal molecule = new BigDecimal(0);

		for(int i=0; i<n; i++) {
			if(i != n-1) {
				molecule=molecule.add(nums[i].multiply(new BigDecimal(Math.pow(2, n-i-2))));
			} else {
				molecule=molecule.add(nums[i]);
			}

		}

		System.out.println(molecule.divide(denominator, 10, BigDecimal.ROUND_HALF_UP));

	}
}