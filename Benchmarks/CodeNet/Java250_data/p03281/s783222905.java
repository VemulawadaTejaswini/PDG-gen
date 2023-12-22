
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
		Main main = new Main();
		int ans = 0;
		for (int i = 1; i <= num; i += 2) {
			if(main.solve(i) == 8) {
				ans++;
			}
		}
		System.out.println(ans);
	}

	public int solve(int num) {
		int factorsCon = 0;
		if (num == 1) {
			factorsCon = 1;
			return factorsCon;
		}else {
			Main m = new Main();
			BigDecimal bigDecimalNum = new BigDecimal(num);

			for (Map.Entry<Integer, Integer> ent : m.factoring(num).entrySet()) {
				BigDecimal entBigDecimal= new BigDecimal(ent.getKey());
				bigDecimalNum = bigDecimalNum.multiply(BigDecimal.ONE.subtract(BigDecimal.ONE.divide(entBigDecimal,1,RoundingMode.HALF_UP)));
				if (factorsCon == 0) {
					factorsCon += (ent.getValue() + 1);
				} else {
					factorsCon *= (ent.getValue() + 1);
				}
			}
			return factorsCon;
		}
	}

	public Map<Integer, Integer> factoring(int num) {
		Map<Integer, Integer>factors = new HashMap<Integer, Integer>();
		int combNum = num;

		while (true) {
			int factor = 0;

			//入力された値が素数であるか調べる
			int numsPiv = (int)Math.sqrt(combNum); //√N = numsPiv とする
			for (int i = 2; i <= numsPiv; i++) {
				if (combNum % i == 0) {
					factor = i;
					if (factors.containsKey(factor)) {
						factors.put(factor, factors.get(factor) + 1);
					} else {
						factors.put(factor, 1);
					}
					break;
				}
			}
			//入力値自身が素数になればbreak
			if (factor == 0) {
				//Map更新
				if (factors.containsKey(combNum)) {
					factors.put(combNum, factors.get(combNum) + 1);
				} else {
					//なければadd
					factors.put(combNum, 1);
				}
				break;
			}else {
				//はじき出した値で入力値を割って更新
				combNum = combNum / factor;
			}
		}
		return factors;
	}
}