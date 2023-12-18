import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String x = sc.next();
		
		String[] initialSplited = x.split("");
		BigInteger initialCnt = BigInteger.ZERO;
		for (int k = 0; k < initialSplited.length; k++) {
			if (initialSplited[k].equals("1")) initialCnt = initialCnt.add(BigInteger.ONE);
		}
		
		
		for (int i = 0; i < n; i++) {
			int ans = 0;
			String[] splited = x.split("");
			// 反転・10進数化
			splited[i] = splited[i].equals("0") ? "1" : "0";
			BigInteger target = new BigInteger(String.join("", splited), 2);
			
			for (int j = 0; ; j++) {
				if (target.compareTo(BigInteger.ZERO) == 0) {
					break;
				}
				String[] tmp = null;
				if (j == 0) {
					tmp = splited;
				} else {
					tmp = target.toString(2).split("");
				}
				BigInteger popcnt = BigInteger.ZERO;
				// popcountを数える
				if (j == 0) {
					if (tmp[i].equals("1")) {
						popcnt = initialCnt.add(BigInteger.ONE);
					} else {
						popcnt = initialCnt.subtract(BigInteger.ONE);
					}
				} else {
					for (int k = 0; k < tmp.length; k++) {
						if (tmp[k].equals("1")) popcnt = popcnt.add(BigInteger.ONE);
					}
				}

				if (popcnt.compareTo(BigInteger.ZERO) == 0) break;
				
				target = target.mod(popcnt);
				ans++;
			}
			
			System.out.println(ans);
		}
	}
}
