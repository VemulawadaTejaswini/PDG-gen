import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = in.nextInt();
		}
		int num = 0;
		boolean hasNum = false;
		for (int i = 0; i < a.length; i++) {
			if (num + 1 == a[i]) {
				num++;
				hasNum = true;
			}
		}
		if (hasNum) {
			System.out.println(N - num);
		} else {
			System.out.println(-1);
		}
		in.close();
	}
}