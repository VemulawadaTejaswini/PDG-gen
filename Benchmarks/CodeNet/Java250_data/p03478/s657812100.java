import java.util.Scanner;

// https://atcoder.jp/contests/abc083/tasks/abc083_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int sum = 0;
		for(int j=1;j<=n;j++) {
			int jj = j;
			int digitSum = 0;
			for(int i=0;i<=4;i++) {
				digitSum = digitSum + jj%10;
				jj = (jj-jj%10)/10;
				if(jj==0) break;
			}
			// 各桁の和（digitSum）がa以上b以下かの確認をし、trueだったらsumに足す。
			if((a<=digitSum)&&(digitSum<=b)) {
				sum = sum + j;
			}
		}

		System.out.println(sum);

		scanner.close();
	}
}