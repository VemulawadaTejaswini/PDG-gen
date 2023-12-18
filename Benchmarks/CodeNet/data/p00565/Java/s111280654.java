import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int masu[] = new int[n];
		int count = 1;
		int countMax = 0;
		for(int i = 0; i < n; i++) {
			if(sc.nextInt() == 1) count++;
			else {
				countMax = Math.max(countMax, count);
				count = 1;
			}

			if(i == n - 1) countMax = Math.max(countMax, count);
		}
		System.out.println(countMax);
	}

}
