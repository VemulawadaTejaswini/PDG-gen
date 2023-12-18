import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		BigInteger sum = BigInteger.ZERO;
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
			sum = sum.add(BigInteger.valueOf(nums[i]));
		}
		sc.nextLine();
		int q = sc.nextInt();
		List<BigInteger> sumList = new ArrayList<BigInteger>();
		for (int i = 0; i < q; i++) {
			sc.nextLine();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int tarCnt = 0;
			for (int j = 0; j < n; j++) {
				if (nums[j] == b) {
					// 置換
					nums[j] = c;
					tarCnt++;
				}
			}
			sum = sum.add(BigInteger.valueOf((c - b) * tarCnt));
			sumList.add(sum);
		}
		for (BigInteger i : sumList) {
			System.out.println(i);
		}
	}
}
