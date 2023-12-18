import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int list01[] = new int[n];
		for (int i = 0; i < n; i++) {
			list01[i] = scanner.nextInt();
		}

		int m = scanner.nextInt();
		int list02[] = new int[m];
		for (int i = 0; i < m; i++) {
			list02[i] = scanner.nextInt();
		}
		scanner.close();

		for (int i = 0; i < m; i++) {
			int num = list02[i];
			boolean flag = roundRobin(list01, num, 0, 0);
			if (flag == true) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

	static boolean roundRobin(int[] list01, int num, int temp, int i) {
		if (num == temp) {
			return true;
		}
		if (i >= list01.length) {
			return false;
		}
		return roundRobin(list01, num, temp, i + 1) || roundRobin(list01, num, temp + list01[i], i + 1);
	}
}