import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.hasNextLine();
		String[] stones = sc.next().split("");
		int redscnt = 0;
		int whitecnt = 0;
		for (int i = 0; i < n; i++) {
			if (stones[i].equals("R")) {
				redscnt++;
			} else {
				whitecnt++;
			}
		}
		
		int min = 0;
		int whiteleft = 0;				// 左辺の白（移動対象）
		int rednow = redscnt;		// 右辺の赤（移動対象）
		for (int i = 0; i <= n; i++) {
			// i = 仕切り位置
			if ( i != 0) {
				if (stones[i-1].equals("W")) {
					// 仕切りの左辺の「白」
					whiteleft++;
				} else {
					// 右辺の「赤」
					rednow--;
				}
			}
			// 多い方の分の移動回数になる
			int max = Math.max(whiteleft, rednow);
			// 最小なら移動回数を更新
			if (min == 0 || max < min) {
				min = max;
			}
		}
		System.out.println(min);
		
	}
}
