import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxPrice;
		int n;
		int maxnow = 0;
		do {
			int tmp;
			n = sc.nextInt();
			maxPrice = sc.nextInt();
			if(n == 0 && maxPrice == 0) {
				break;
			}
			maxnow = 0;
			int[] priceArray = new int[n];
			for (int i = 0; i < n; i++) {
				priceArray[i] = sc.nextInt();
			}

			for (int i = 0; i < n - 1; i++) {
				for (int i2 = i + 1; i2 < n; i2++) {
					if ((tmp = priceArray[i] + priceArray[i2]) > maxnow && maxPrice >= tmp)
						maxnow = tmp;
				}
			}

			if (maxnow != 0)
				System.out.println(maxnow);
			else
				System.out.println("NONE");

		} while (true);
	}
}

