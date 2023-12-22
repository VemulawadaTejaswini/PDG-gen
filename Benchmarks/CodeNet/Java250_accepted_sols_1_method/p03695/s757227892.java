import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] b = new int[9];
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			for(int j = 0; j < 8; j++) {
				if(400 * j <= a && a <= 399 + 400 * j) {
					b[j]++;
					break;
				}
			}
			if(3200 <= a) {
				b[8]++;
			}
		}
		
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
			if(b[i] >= 1) {
				sum++;
			}
		}

		if(b[8] == 0) {
			System.out.println(sum + " " + sum);
		} else {
			if(sum == 1) {
				System.out.println(sum + " " + (sum - 1 + b[8]));
			} else {
				System.out.println(sum - 1 + " " + (sum - 1 + b[8]));
			}
		}
	}
}
