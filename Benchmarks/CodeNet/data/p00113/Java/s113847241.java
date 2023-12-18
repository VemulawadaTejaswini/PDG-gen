import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int p, q;
		int ans[];
		int temp;
		int a[];
		int index;
		boolean flag;

		while (sc.hasNext()) {
			p = sc.nextInt();
			q = sc.nextInt();
			ans = new int[100];
			a = new int[q];
			flag = true;

			ans[0] = p / q;
			temp = p % q;
			a[temp] = 1;
			index = 1;
			while (true) {
				if (temp == 0) {
					break;
				}
				temp *= 10;
				ans[index++] = temp / q;
				temp %= q;
				if (0 < a[temp]) {
					flag = false;
					break;
				}
				a[temp] = index;
			}
			for (int i = 1; i < index; i++) {
				System.out.print(ans[i]);
			}
			System.out.println();
			if (!flag) {
				for (int i = 1; i < index; i++) {
					if (i == a[temp]) {
						for (int j = i; j < index; j++) {
							System.out.print("^");
						}
						break;
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}