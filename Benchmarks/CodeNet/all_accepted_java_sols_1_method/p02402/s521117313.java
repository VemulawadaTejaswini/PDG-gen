import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int min, max;
			long total;

			int[] all = new int[n];

			for (int i=0; i < n; i++) {
				all[i] = sc.nextInt();
			}

			min = max = all[0]; //初期化
			total = 0; //初期化

			for (int i=0; i < n; i++) {
				total += all[i];
				min = Math.min(min, all[i]);
				max = Math.max(max, all[i]);
			}

			System.out.println(min + " " + max + " " + total);

		}
	}
}
