import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int summation = 0;

		for (int i = 1; i <= N; i++) {
			int sum = 0;
			String I = String.valueOf(i);
			for (int j = 0; j < I.length(); j++) {
				sum += Integer.parseInt(I.substring(j, j + 1));
			}
			if (sum >= A && sum <= B) {
				summation += i;
			}
		}

		System.out.println(summation);
	}
}