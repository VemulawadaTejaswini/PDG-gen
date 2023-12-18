import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		sort(num);
	}

	public static void sort(int[] num) {
		int count = 0;

		for (int i = 0; i<num.length-1; i++) {
			for (int j = num.length - 1; j >= i + 1; j--) {
				if (num[j - 1] > num[j]) {
					num[j - 1] = num[j - 1] ^ num[j];
					num[j] = num[j - 1] ^ num[j];
					num[j - 1] = num[j - 1] ^ num[j];
					count++;
				}
			}
		}

		for (int k = 0; k < num.length; k++) {
			if (k > 0) {
				System.out.print(" ");
			}
			System.out.print(num[k]);
		}
		System.out.println();
		System.out.print(count);
	}
}

