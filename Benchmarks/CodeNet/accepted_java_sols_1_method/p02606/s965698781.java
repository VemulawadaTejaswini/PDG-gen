import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int d = sc.nextInt();
		int a = r / d;
		int b = l / d;
		if (l % d == 0) {
			b--;
		}
		System.out.println(a-b);
	}
}
