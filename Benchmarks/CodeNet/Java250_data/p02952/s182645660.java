import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int answer = 0;
		
		if (N == 100000) {
			answer = 9 + 900 + 90000;
		} else if (N <= 99999 && N >= 10000) {
			answer = 9 + 900 + (N - 9999);
		} else if (N <= 9999 && N >= 1000) {
			answer = 9 + 900;
		} else if (N <= 999 && N >= 100) {
			answer = 9 + (N - 99);
		} else if (N <= 99 && N >= 10) {
			answer = 9;
		} else {
			answer = N;
		}

		System.out.println(answer);
	}
}