import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		int[] iarray = new int[10];
		int[] rank = new int[] { -1, -2, -3 };
		for (int i = 0; i < iarray.length; i++) {
			Scanner scanner = new Scanner(System.in);
			int v = scanner.nextInt();
			for (int j = 0; j < rank.length; j++) {
				if (v > rank[j]) {
					int pre = rank[j];
					rank[j] = v;
					v = pre;
				}
			}

		}

		for (int i = 0; i < 3; i++) {
			System.out.println(rank[i]);
		}

	}
}