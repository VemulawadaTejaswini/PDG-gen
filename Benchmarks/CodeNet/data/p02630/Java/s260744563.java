import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		BigInteger sum = BigInteger.ZERO;
		BigInteger[] nums = new BigInteger[100000];
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			nums[num] = nums[num].add(BigInteger.ONE);
			sum = sum.add(BigInteger.valueOf(num));
		}
		sc.nextLine();
		int q = sc.nextInt();
		List<BigInteger> sumList = new ArrayList<BigInteger>();
		for (int i = 0; i < q; i++) {
			sc.nextLine();
			int b = sc.nextInt();
			int c = sc.nextInt();
			BigInteger bigB = BigInteger.valueOf(sc.nextInt());
			BigInteger bigC = BigInteger.valueOf(sc.nextInt());
			BigInteger cnt = nums[b];
			sum = sum.add(bigC.multiply(cnt));
			sum = sum.subtract(bigB.multiply(cnt));
			sumList.add(sum);
			
			nums[c] = nums[c].add(nums[b]);
			nums[b] = BigInteger.ZERO;
		}
		for (BigInteger i : sumList) {
			System.out.println(i);
		}
	}
}
