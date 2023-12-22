import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N < 10) {
			System.out.print(N);
		} else if (N < 100) {
			System.out.print(9);
		} else if (N < 1000) {
			System.out.print(9 + (N - 99));
		} else if (N < 10000) {
			System.out.print(909);
		} else if (N < 100000) {
			System.out.print(909 + (N - 9999));
		}else {
			System.out.print(90909);
		}
	}
}
