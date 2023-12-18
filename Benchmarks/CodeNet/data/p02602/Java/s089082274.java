import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		
		int[] div = new int[n];
		for (int i = 0; i < n; i++) {
			int tmpScore = sc.nextInt();
			div[i] = tmpScore;
			
			if (i >= k) {
				if (tmpScore > div[i-k]) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}
