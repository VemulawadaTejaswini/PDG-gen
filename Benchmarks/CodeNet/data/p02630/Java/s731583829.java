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
		int[] nums = new int[n];
		Map map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
			if (map.containsKey(nums[i])) {
				int tmp = (int) map.get(nums[i]);
				map.put(nums[i], tmp+1);
			} else {
				map.put(nums[i], 1);
			}
			sum = sum.add(BigInteger.valueOf(nums[i]));
		}
		sc.nextLine();
		int q = sc.nextInt();
		List<BigInteger> sumList = new ArrayList<BigInteger>();
		for (int i = 0; i < q; i++) {
			sc.nextLine();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (map.containsKey(b)) {
				// 置換あり
				int cnt = (int)map.get(b);
				sum = sum.add(BigInteger.valueOf((c - b) * cnt));
				
				if (map.containsKey(c)) {
					int tmp = (int) map.get(c);
					map.put(c, tmp+cnt);
				} else {
					map.put(c, cnt);
				}
			}
			sumList.add(sum);
		}
		for (BigInteger i : sumList) {
			System.out.println(i);
		}
	}
}
