import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String x = sc.next();
		
		for (int i = 0; i < n; i++) {
			int ans = 0;
			String[] splited = x.split("");
			// 反転・10進数化
			splited[i] = splited[i].equals("0") ? "1" : "0";
			int target = Integer.parseInt(String.join("", splited), 2);
			
			for (int j = 0; ; j++) {
				String[] tmp = null;
				if (j == 0) {
					tmp = splited;
				} else {
					tmp = Integer.toBinaryString(target).split("");
				}
				int popcnt = 0;
				// popcountを数える
				for (int k = 0; k < tmp.length ; k++) {
					if (tmp[k].equals("1")) popcnt++;
				}
				
				target = target % popcnt;
				ans++;
				if (target == 0) {
					break;
				}
			}
			
			System.out.println(ans);
		}
	}
}
