import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		main : for (int i = 0; i < n; i++) {
			int a = 0, b = 0;
			int[] nums = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
			for (int p : nums) {
				if (p < Math.min(a, b)) {
					System.out.println("NO");
					continue main;
				}
				if (a > b && a < p || a == 0)
					a = p;
				else
					b = p;
			}
			System.out.println("YES");
		}

	}

}