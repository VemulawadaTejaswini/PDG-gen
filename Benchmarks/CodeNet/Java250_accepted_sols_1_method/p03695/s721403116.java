import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] clr = new int[8];
		int free = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a >= 3200) {
				free++;
			} else {
				clr[a / 400] = 1;
			}
		}

		int min = 0;
		for (int i : clr) {
			min += i;
		}

		int max = min;

		if (min < 1) {
			min = 1;
		}

		for (int i = 0; i < free; i++) {
			max++;
		}

		System.out.println(min + " " + max);
		sc.close();
	}
}
