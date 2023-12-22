import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] h = new int[n];

		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		boolean jdg = true;
		for (int i = n - 1; i > 0; i--) {
			if (h[i] >= h[i - 1] || h[i] >= --h[i - 1])
				continue;
			jdg = false;
			break;
		}

		System.out.println(jdg ? "Yes" : "No");
	}

}
