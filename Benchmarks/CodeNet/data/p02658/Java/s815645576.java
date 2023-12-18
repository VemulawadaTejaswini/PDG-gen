import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		long ans = 1;
		boolean check = true;
		for (int i = 0; i < N; i++) {
			if (ans * arr[i] >= 0) {
				ans = ans * arr[i];
			} else {
				check = false;
				System.out.println(-1);
			}
		}
		if (check) {
			System.out.println(ans);
		}
	}
}