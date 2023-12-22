import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int N, max = 0, sum = 0;
		int a[] = new int[100];

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];

			if(max < a[i]) {
				max = a[i];
			}
		}

		if(max < sum - max) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}