import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] array = new int[n];

		for(int i = 0; i < n; i++) {
			array[i] = 0;
		}

		for(int i = 0; i < k; i++) {
			int d = sc.nextInt();
			for(int j = 0; j < d; j++) {
				int a = sc.nextInt();
				array[a - 1] = 1;
			}
		}

		int ans = 0;

		for(int i = 0; i < n; i++) {
			if(array[i] == 0) {
				ans++;
			}
		}

		System.out.println(ans);

		sc.close();

	}

}
