import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = 0;
		int max = 0;
		int sum = 0;
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if (i == 0) {
				min = A;
				max = A;
				sum = A;
			}
			else {
				if (A < min)	min = A;
				if (A > max)	max = A;
				sum = sum + A;
			}
		}
		System.out.println(min + " " + max + " " + sum);
	}
}

