

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		while (true) {
			String A = sc.next();
			if (A.equals("0")) {
				break;
			}
			char X[] = A.toCharArray();
			int sum =0;
			for (int i=0; i<X.length; i++) {
			sum += X[i] - '0';
			}
			System.out.println(sum);
		}
	}
}

