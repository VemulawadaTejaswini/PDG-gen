import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long sum = 0;
		for (long i = 1; i <= N; i++) {
			if (i%5!=0&&i%3!=0) sum+=i;
		}
		System.out.println(sum);
	}

}