import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			for (int x = 1; x*x < i ; x++) {
				for (int y = 1; x*x + x*y + y*y < i ; y++) {
					for (int z = 1; ; z++) {
						int sum = x*x + y*y + z*z + x*y + y*z + z*x;
						if (sum == i) {
							cnt++;
							break;
						} else if (sum > i) {
							break;
						}
					}
				}
			}
			System.out.println(cnt);
		}
		
	}
}
