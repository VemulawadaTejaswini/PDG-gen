import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int L[] = new int[N];

		int ans = 0;

		for(int i = 0;i < N; i++) {
			L[i] = scan.nextInt();
		}

		Arrays.sort(L);

		for(int i = 0; i < N - 2; i++) {
			for(int j = i + 1; j < N - 1; j++) {
				for(int k = j + 1; k < N; k++) {
					if(!(L[i] == L[j] || L[j] == L[k]) && L[i] + L[j] > L[k]) {
						ans++;
						System.out.println("" + L[i] + L[j] + L[k]);
					}
				}
			}
		}

		System.out.println(ans);

	}
}