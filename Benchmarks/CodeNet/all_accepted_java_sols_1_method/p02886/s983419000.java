import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[N];

		for (int i = 0; i < N; i++)
			d[i] = sc.nextInt();
		sc.close();
		int s = 0;
		for (int j = 0; j < N; j++) {
			for (int k = j + 1; k < N; k++) {
				s += d[j] * d[k];
			}

		}
		System.out.println(s);
	}
}