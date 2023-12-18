import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B = sc.nextInt();
		int min = B;
		int max = B;
		int sum = B;		
		for(int i = 0; i < N-1; i++) {
			int A = sc.nextInt();
			if (A < min)
				min = A;
			if (A > max)
				max = A;
			sum = sum + A;
		}
		System.out.printf("%d %d %d\n", min, max, sum);
	}
}

