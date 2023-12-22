import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int d = sc.nextInt();
		
		int cnt = 0;
		for (int i = l; l <= r; l++) {
			if (l % d == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
