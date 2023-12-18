import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int ans = 0;
		for(int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			while(a % 2 == 0) {
				a /= 2;
				ans++;
			}
		}
		System.out.println(ans);
	}

}