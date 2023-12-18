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
		BigInteger[] nums = new BigInteger[n];
		Map<BigInteger, BigInteger> map = new HashMap<BigInteger, BigInteger>();
		for (int i = 0; i < n; i++) {
			nums[i] = BigInteger.valueOf(sc.nextInt());
			if (map.containsKey(nums[i])) {
				BigInteger tmp = (BigInteger) map.get(nums[i]);
				map.put(nums[i], tmp.add(BigInteger.ONE));
			} else {
				map.put(nums[i], BigInteger.ONE);
			}
			sum = sum.add(nums[i]);
		}
		sc.nextLine();
		int q = sc.nextInt();
		List<BigInteger> sumList = new ArrayList<BigInteger>();
		for (int i = 0; i < q; i++) {
			sc.nextLine();
			BigInteger b = BigInteger.valueOf(sc.nextInt());
			BigInteger c = BigInteger.valueOf(sc.nextInt());
			if (map.containsKey(b)) {
				// 置換あり
				BigInteger cnt = map.get(b);
				sum = sum.add((c.subtract(b)).multiply(cnt));
				
				if (map.containsKey(c)) {
					BigInteger tmp = map.get(c);
					map.put(c, tmp.add(cnt));
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
