import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();
		int[] ans = new int[1000000];


		for(int i = 1; i <= 100; i++) {
			for(int j = 1; j <= 100; j++) {
				for(int k = 1; k <= 100; k++) {
					int tmp = i * i + j * j + k * k + i * j + j * k + k * i;
					ans[tmp]++;
				}
			}
		}

		for(int i = 1; i <= N; i++) {
			System.out.println(ans[i]);
		}
	}
}
