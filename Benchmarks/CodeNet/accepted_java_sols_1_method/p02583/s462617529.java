import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int L[] = new int[N];
		int answer = 0;

		for (int i = 0; i < N; i++) {
			L[i] = scan.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int k = i; k < N; k++) {
				for (int n = k; n < N; n++) {
					if (L[i] != L[k] && L[k] != L[n] && L[n] != L[i]) {
						if (L[i] + L[k] > L[n] && L[k] + L[n] > L[i] && L[n] + L[i] > L[k]) answer++;
					}
				}
			}
		}

		System.out.println(answer);

 	}
}