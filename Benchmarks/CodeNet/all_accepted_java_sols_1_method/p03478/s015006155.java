import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sumAll = 0;

		for(int i = 1; i <= n; i++) {
			String iString = String.valueOf(i);
			int digitSum = 0;

			// 各桁の和を計算
			for(int j = 0; j < iString.length(); j++) {
				digitSum += iString.charAt(j) - '0';
			}

			// 各桁の和がA以上B以下であるか判定
			if(a <= digitSum && digitSum <= b)
				sumAll += i;
		}
		System.out.println(sumAll);
		scan.close();

	}

}