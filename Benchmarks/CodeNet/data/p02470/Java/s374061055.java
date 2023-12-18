

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if(n == 1){
			System.out.println(0);
		}
		int divisor = 2;

		long result = 1;

		while(n > 1){

			int count = 0;

			while(n % divisor == 0){
				count++;
				n /= divisor;
			}

			if(count != 0){
				result *= Math.pow(divisor, count) - Math.pow(divisor, count - 1);
			}

			divisor++;
		}

		System.out.println(result);
	}

}
