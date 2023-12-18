import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();

		int[] rsum = new int[r];
		int[] csum = new int[c];
		int fsum = 0;

		for (int k = 0; k < r; k++) {
			for (int i = 0; i < c; i++) {
				int now_cell = sc.nextInt();
				rsum[k] = rsum[k] + now_cell;
				System.out.print(now_cell + " ");
				csum[i] = csum[i] + now_cell;
			}
			System.out.println(rsum[k]);
			fsum = fsum + rsum[k];

		}
		for (int j = 0; j < c; j++) {
			System.out.print(csum[j] + " ");
		}
		System.out.println(fsum);

	}

}

