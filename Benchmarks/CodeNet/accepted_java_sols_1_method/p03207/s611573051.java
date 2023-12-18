import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int high = 0;
		int sum = 0;

		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			sum += temp;
			if(temp > high) {
				high = temp;
			}
		}

		System.out.println(sum - (high / 2));

	}
}