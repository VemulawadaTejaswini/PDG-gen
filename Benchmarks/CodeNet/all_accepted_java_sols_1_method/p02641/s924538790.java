import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int N = scan.nextInt();
		int p = 0;
		int min;
		int max;
		int[] result = new int[N];

		if(N == 0) {
			System.out.println(X);
			System.exit(0);
		}

		for(int i = 0;i < N;i++) {
			p = scan.nextInt();
			result[i] = p;
		}

		for(int i = 0;;i++) {
			min = X - i;
			for(int j = 0;j < N;j++) {
				if(result[j] == min) {
					break;
				}else if(j == N - 1) {
					System.out.println(min);
					System.exit(0);
				}
			}
			max = X + i;
			for(int j = 0;j < N;j++) {
				if(result[j] == max) {
					break;
				}else if(j == N - 1) {
					System.out.println(max);
					System.exit(0);
				}
			}
		}

	}
}