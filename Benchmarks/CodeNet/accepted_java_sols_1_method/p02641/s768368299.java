import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力の受け取り
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int[] P = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}
		int[] array = new int[103];
		for (int i = 0; i < 103; i++) {
			array[i] = i - 1;
		}
		for (int i = 0; i < N; i++) {
			array[P[i] + 1] = -100;
		}
		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		

		int dis = X - array[0];
		int ans = array[0];
		for (int i = 1; i < array.length; i++) {
			if (Math.abs(X - array[i]) < dis) {
				dis = X - array[i];
				ans = array[i];
			}
		}
		System.out.println(ans);

		sc.close();
	}
}
