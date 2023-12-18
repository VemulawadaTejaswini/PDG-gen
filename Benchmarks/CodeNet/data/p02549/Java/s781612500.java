import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static int d = 998244353;
	public static int cnt = 0;
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int d = 998244353;
		List<Integer> s = new ArrayList<Integer>();
		
		for (int i = 0; i < k; i++) {
			sc.nextLine();
			int l = sc.nextInt();
			int r = sc.nextInt();
			for (int j = l; j <= r; j++) {
				s.add(j);
			}
		}
		Collections.sort(s);
		int place = 1;
		multiply(place, n, 0, s);
		System.out.println(cnt);
	}
	
	private static void multiply(int place, int n, int z, List<Integer> s) {
		for (int i = z; i < s.size(); i++) {
			int plusplace = place + s.get(i);
			if (plusplace == n) {
				// 一致
				cnt = (cnt + 1) % d;
				continue;
			} else if (plusplace > n) {
				// オーバー・次数へ
				break;
			} else {
				// 未達
				multiply(plusplace, n, 0, s);
			}
		}
	}
}
