import java.util.Scanner;
public class Main {
	public static int N;
	public static int[] A;
	public static int[] A_work;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		A = new int[N];
		A_work = new int[N];
		for (int n = 0;n < N ;n++ ) {
			A[n] = Integer.parseInt(scan.next());
		}
		scan.close();

		System.out.println(search());
	}

	private static long search() {
		long sum = 0;
		for (int n = 0;n < N-1 ;n++ ) {
			int X = A[n] + A_work[n];
			int Y = A[n + 1] + A_work[n + 1];
			if (X > Y) {
				int diff = X - Y;
				A_work[n + 1]+=diff;
				Y+=diff;
				sum+=diff;
			}
		}
		return sum;
	}
}
