import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int count = 0;
		for (int j = 1; j <= (N/2)+1; j++) {
			int sum = 0;
			for (int i = j; i <= (N/2)+1; i++) {
				sum += i;

				if (sum == N) {
					count++;
					sum = 0;
					j=i-1;
					break;
				}

				if (sum > N) {
					sum = 0;
				}
			}

		}
		System.out.println(count);
	}

}

