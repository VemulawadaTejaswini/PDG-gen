import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] L = new int[N];

		for(int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}

		int max = 0;

		for(int i = 0; i < N; i++) {
			if(max < L[i]) {
				max = L[i];
			}
		}

		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += L[i];
		}
		sum -= max;

		if(max < sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}