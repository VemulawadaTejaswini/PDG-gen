import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		int count = 1;
		int answer = 0;


		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			if (a[i] == count) {
				count++;
			} else {
				answer++;
			}
		}

		if (answer == N) {
			System.out.println("-1");
		} else {
			System.out.println(answer);
		}
	}

}