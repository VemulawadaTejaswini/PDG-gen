import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] r = new int[n];
		for(int i=0; i<n; i++) {
			r[i] = sc.nextInt();
		}

		int minPrice = 2000000001;
		int maxProfit = -2000000001;
		for(int i=0; i<n; i++) {
			if (r[i]-minPrice > maxProfit) {
				maxProfit = r[i]-minPrice;
			}
			if (r[i] < minPrice) {
				minPrice = r[i];
			}
		}

		System.out.println(maxProfit);
	}
}

