import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();

		double eight = 0.08;
		double ten = 0.1;

		int start1 = (int)(A / eight);
		int start2 = (int)(B / ten);

		if (start1 == start2) {
			System.out.println(start1);
		}
		else {
			int start = Math.min(start1, start2);

			boolean exists = false;
			for (int i = 1; i < 11; i++) {
				int ans1 = (int)((start + i) * eight);
				int ans2 = (int)((start + i) * ten);
				if (ans1 == A && ans2 == B) {
					System.out.println(start + i);
					exists = true;
					break;
				}
			}
			if (!exists) {
				System.out.println(-1);
			}
		}
	}
}
