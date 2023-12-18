import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] intArr = new int[n];
		for (int i = 0; i < n; i++) {
			intArr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < n - 1; i++) {		
			while (intArr[i] > intArr[i + 1]) {
				intArr[i + 1] += 1;
				sum++;
			}
		}

		System.out.println(sum);

	}
}