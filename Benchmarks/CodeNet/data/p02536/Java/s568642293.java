import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] cities = new int[n+1];
		for (int i = 0; i < m; i++) {
			sc.nextLine();
			int a = sc.nextInt();
			int b = sc.nextInt();
			cities[a] = 1;
			cities[b] = 1;
		}
		int cnt = 0;
		for (int i = 1; i < n+1; i++) {
			if (cities[i] == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
