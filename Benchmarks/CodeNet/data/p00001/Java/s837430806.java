import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] rank = new int[3];
		for (int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			int v = sc.nextInt();
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