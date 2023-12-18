import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int ans = 0;
		int maxSub = 0;
		for (int i = 0; i < 5; i++) {
			int time = sc.nextInt();
			int sub;
			if (time % 10 == 0) {
				sub = 0;
			} else {
				sub = 10 - (time % 10);
			}
			ans += time + sub;
			if (sub > maxSub) {
				maxSub = sub;
			}
		}

		System.out.println(ans - maxSub);

	}

}
