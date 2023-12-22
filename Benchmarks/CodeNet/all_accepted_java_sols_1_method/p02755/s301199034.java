import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int ans = Math.min(a * 7, b * 9); ans <= Math.max(a * 13, b * 11); ans++) {
			if ((int)(ans * 0.08) == a && (int)(ans * 0.1) == b) {
				System.out.println(ans);
				return;
			}
		}
		System.out.println(-1);

	}

}
