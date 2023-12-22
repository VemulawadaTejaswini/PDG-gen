import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] directSubordinateCnts = new int[n + 10];
		for (int i = 2; i <= n; ++i) {
			int directBoss = sc.nextInt();
			++directSubordinateCnts[directBoss];
		}

		for (int i = 1; i <= n; ++i) {
			System.out.println(directSubordinateCnts[i]);
		}
	}

}
