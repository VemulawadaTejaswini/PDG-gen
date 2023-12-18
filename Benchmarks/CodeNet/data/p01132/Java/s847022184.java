import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean first = true;
		
		while (true) {
			final int price = sc.nextInt();

			if (price == 0) {
				break;
			}
			
			if(first){
				first = !first;
			}else{
				System.out.println();
			}

			int[] coins = new int[4];

			for (int i = 0; i < 4; i++) {
				coins[i] = sc.nextInt();
			}

			int min = Integer.MAX_VALUE;
			int m_i = 0;
			int m_j = 0;
			int m_k = 0;
			int m_l = 0;

			for (int i = 0; i <= coins[0]; i++) {
				for (int j = 0; j <= coins[1]; j++) {
					for (int k = 0; k <= coins[2]; k++) {
						for (int l = 0; l <= coins[3]; l++) {
							final int sum = i * 10 + j * 50 + k * 100 + l * 500;

							if (price > sum) {
								continue;
							}

							final int diff = sum - price;
							int n_l = diff / 500;
							int n_k = (diff - n_l * 500) / 100;
							int n_j = (diff - n_l * 500 - n_k * 100) / 50;
							int n_i = (diff - n_l * 500 - n_k * 100 - n_j * 50) / 10;
							
							int len = (coins[3] - l + n_l) + (coins[2] - k + n_k) + (coins[1] - j + n_j) + (coins[0] - i + n_i);
							if (len < min) {
								m_i = i;
								m_j = j;
								m_k = k;
								m_l = l;
								min = len;
							}
						}
					}
				}
			}

			if (m_i != 0) {
				System.out.println("10 " + m_i);
			}
			if (m_j != 0) {
				System.out.println("50 " + m_j);
			}
			if (m_k != 0) {
				System.out.println("100 " + m_k);
			}
			if (m_l != 0) {
				System.out.println("500 " + m_l);
			}
		}

	}
}