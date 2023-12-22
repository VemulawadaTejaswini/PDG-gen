import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力の受け取り
		Scanner sc = new Scanner(System.in);
		int[] x = new int[5];
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		x[2] = sc.nextInt();
		x[3] = sc.nextInt();
		x[4] = sc.nextInt();

		// 解法
		int ret = 0;
		for (int i = 0; i < 5; i++) {
			if (x[i]==0) {
				ret = i + 1;
			}
		}

		System.out.println(ret);

		sc.close();
	}
}
