import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int[] input = new int[5];

		input[0] = sc1.nextInt();
		input[1] = sc1.nextInt();
		input[2] = sc1.nextInt();
		input[3] = sc1.nextInt();
		input[4] = sc1.nextInt();

		int[] test = new int[5];

		for (int i=0; i < 5 ; i++) {
			test[i] = input[i]%10;
		}

		int idx = 0;
		for (int i=0; i < 4 ; i++) {
			if (test[i+1] != 0 && test[idx] > test[i+1]) {
				idx = i+1;
			}
		}

		int ans = 0;

		for (int i=0; i < 5 ; i++) {
			if (i == idx) {
				continue;
			}
			else {
				ans += input[i];
				if (input[i]%10 != 0) {
					ans += 10-(input[i]%10);
				}
				//System.out.println(ans);
			}
		}

		ans += input[idx];
		System.out.println(ans);

		sc1.close();

	}

}