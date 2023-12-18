import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[N];

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int n = sc.nextInt();
			sum += arr[i] = n;
		}

		double ave = (double)sum / N;
		double subMin = 100;
		int imin = 0;
		for (int i = 0; i < arr.length; i++) {
			double sub = arr[i] - ave;
			if (sub < 0) {
				sub /= -1.0;
			}
			if (subMin > sub) {
				subMin = sub;
				imin = i;
			}
		}
		System.out.println(imin);
		sc.close();
	}

}
