

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];

		for(int i = 0; i < n; i++){
			a[sc.nextInt()]++;
		}

		int count = 0;

		int start = 1;
		if(n % 2 == 1){
			start = 2;

			if(a[0] != 1){
				System.out.println(0);
				return;
			}

			count++;
		}

		for(int i = start; i < n; i += 2){
			if(a[i] != 2){
				System.out.println(0);
				return;
			}

			count += a[i];
		}

		if(count != n){
			System.out.println(0);
			return;
		}

		else {
			long result = 1;
			for(int i = 0; i < n/2; i++){
				result *= 2;
				result %= 1_000_000_007;
			}

			System.out.println(result);
		}

	}

}
