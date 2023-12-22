import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mochis[] = new int[n];
		for (int i = 0; i < n; i++) {
			mochis[i] = sc.nextInt();
		}
		Arrays.sort(mochis);
		int count = 0;
		int nowHaba = 0;
		for (int i = 0; i < n; i++) {
			if (nowHaba < mochis[i]) {
				nowHaba = mochis[i];
				count++;
			}
		}
		System.out.println(count);
	}

}
