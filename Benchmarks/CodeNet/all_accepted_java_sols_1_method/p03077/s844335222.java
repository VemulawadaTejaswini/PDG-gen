import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		long num = scan.nextLong();
		long min = Long.MAX_VALUE;
		for(int i = 0; i < 5; i++) {
			long temp = scan.nextLong();
			if(temp < min) {
				min = temp;
			}
		}

		// check
		long group = (long)Math.ceil((double)num / (double)min);
		long answer = (group - 1) + 5;

		// answer
		System.out.println(answer);


	}
}
