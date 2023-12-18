import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int prime[] = new int[1000010];

		Arrays.fill(prime, 1);
		prime[0] = 0;
		prime[1] = 0;
		for (int i = 2; i < 1000010; i++) {
			for (int j = i * 2; j < 1000010; j += i) {
				prime[j] = 0;
			}
		}

		while (true) {
			int n = sc.nextInt();
			int cost = sc.nextInt();
			if ((n | cost) == 0) {
				break;
			}
			int price[] = new int[n];
			int array[] = new int[cost + 1];
			for (int i = 0; i < n; i++) {
				price[i] = sc.nextInt();
				array[price[i]] = 1;
			}

			int id = 0;
			while (id < cost + 1) {
				while (id < cost + 1 && array[id] == 0) {
					id++;
				}
				if (cost + 1 <= id) {
					break;
				}
				for (int i = 0; i < n; i++) {
					if (id + price[i] < cost + 1) {
						array[id + price[i]] = 1;
					}
				}
				id++;
			}
			boolean flag = false;
			for (int i = cost; 0 <= i; i--) {
				if (array[i] == 1 && prime[i] == 1) {
					System.out.println(i);
					flag = true;
				}
				if (flag) {
					break;
				}
			}

			if (!flag) {
				System.out.println("NA");
			}
		}
	}
}