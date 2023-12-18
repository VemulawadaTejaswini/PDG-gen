import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		BigInteger answer = BigInteger.ZERO;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				answer = answer.add(BigInteger.valueOf(nums[i]).multiply(BigInteger.valueOf(nums[j])));
			}
		}
		BigInteger m = BigInteger.ONE;
		for (int i = 0; i < 9; i++) {
			m = m.multiply(BigInteger.valueOf(10));
		}
		m = m.add(BigInteger.valueOf(7));
		System.out.println(answer.mod(m));
		
//		BigInteger[] anss = new BigInteger[n];
//		anss[0] = BigInteger.ONE;
//		sc.nextLine();
//		for (int i = 0; i < n; i++) {
//			// 掛け合わせを保持
//			anss[i] = anss[i].multiply(BigInteger.valueOf(sc.nextInt()));
//		}
		
	}
	
}
