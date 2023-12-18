import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		
		int before = 1;
		int tmp = 1;
		int[] div = new int[n];
		for (int i = 0; i < n; i++) {
			int tmpScore = sc.nextInt();
			div[i] = tmpScore;
			if (i < k) {
				// k-1まで
				before = before * tmpScore;
				if (i != 0) {
					tmp = tmp * tmpScore;
				}
			} else {
				tmp = tmp * tmpScore;
				if (tmp > before) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
				before = tmp;
				tmp = tmp / div[i-k+1];
			}
		}
	}
}
