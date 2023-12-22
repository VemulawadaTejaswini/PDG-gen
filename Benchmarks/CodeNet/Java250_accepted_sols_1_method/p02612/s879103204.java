import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 1000 - (n % 1000);
		if (cnt == 1000) {
			cnt = 0;
		}
		System.out.println(cnt);
	}
}
