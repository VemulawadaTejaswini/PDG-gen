import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String num[] = new String[n];

		for (int i = 0; i < n; i++) {
			num[i] = scan.next();
		}

		String num2[] = num.clone();

		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= i + 1; j--) {
				if (num2[j].charAt(1) < num2[j - 1].charAt(1)) {
					String tmp = num2[j];
					num2[j] = num2[j - 1];
					num2[j - 1] = tmp;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(num2[i]);
			if (i != n - 1)
				System.out.print(" ");
		}

		System.out.println();
		System.out.println("Stable");
		
		for (int i = 0; i < n; i++) {
			int mini = i;
			for (int j = i; j < n; j++) {
				if (num[j].charAt(1) < num[mini].charAt(1)) {
					mini = j;
				}
			}

			if (mini != i) {
				String tmp = num[i];
				num[i] = num[mini];
				num[mini] = tmp;
			}
		}

		boolean isStable = true;
		
		for (int i = 0; i < n; i++) {
			if (num[i] != num2[i])
				isStable = false;
			
			System.out.print(num[i]);
			if (i != n - 1)
				System.out.print(" ");
		}
		System.out.println();
		if (isStable) {
			System.out.println("Stable");
		}
		else {
			System.out.println("Not stable");
		}
		
		scan.close();
	}

}