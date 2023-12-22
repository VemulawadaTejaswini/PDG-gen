import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int sum = 0;
		while(sum < N) {
			sum += 1000;
		}
		System.out.println(sum - N);
	}
}
