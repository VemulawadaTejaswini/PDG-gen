import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;

		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int start = sc.nextInt();
			int goal  = sc.nextInt();

			if (start <= 5 && goal <= 5) {
				String s = "";
				int k = start;
				while (true) {
					System.out.print(s + k);
					s = " ";
					k += (k < goal) ? 1 : -1;
					if (k == goal) {
						break;
					}
				}
				System.out.println(s + k);
			} else if (6 <= start && 6 <= goal) {
				if (start < goal) {
					String s = "";
					for (int j = start; j <= goal; j++) {
						System.out.print(s + j);
						s = " ";
					}
					System.out.println();
				} else {
					String s = "";
					for (int j = start; j <= 9; j++) {
						System.out.print(s + j);
						s = " ";
					}
					System.out.print(" 5 4 3 2 1 0 1 2 3 4 5");
					for (int j = 6; j <= goal; j++) {
						System.out.print(s + j);
						s = " ";
					}
					System.out.println();
				}
			} else if (start < goal) {
				String s = "";
				for (int j = start; j <= goal; j++) {
					System.out.print(s + j);
					s = " ";
				}
				System.out.println();
			} else {
				String s = "";
				for (int j = start; j <= 9; j++) {
					System.out.print(s + j);
					s = " ";
				}
				for (int j = 5; goal <= j; j--) {
					System.out.print(s + j);
				}
				System.out.println();
			}
		}
	}
}