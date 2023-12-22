import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++) {
			numbers[i] = scan.nextInt();
		}
		
		int count = 0;
		for (int i = 1; i <= numbers.length; i++) {
			if (numbers[i - 1] == i) {
				count++;
			}
		}
		
		if (count >= (N - 2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}
}