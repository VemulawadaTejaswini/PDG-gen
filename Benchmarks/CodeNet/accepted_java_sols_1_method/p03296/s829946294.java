import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}

		int count = 0;
		for (int i = 0; i < N-2; i++) {
			if (a[i] == a[i+1]) {
				a[i+1] = a[i+2] + 1;
				count++;
			}
		}
		if (a[N-2] == a[N-1]) {
			count++;
		}
		System.out.println(count);
	}

}