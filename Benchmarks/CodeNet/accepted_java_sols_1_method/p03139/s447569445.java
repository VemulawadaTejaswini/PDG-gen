import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int min;
		int max;
		if (N < A + B) {
			min = A+B-N;
		} else {
			min = 0;
		}
		max = Math.min(A, B);

		System.out.println(max + " " + min);
	}

}
