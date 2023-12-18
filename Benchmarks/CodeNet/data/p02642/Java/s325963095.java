import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int a[] = new int[N];
		Boolean ans[] = new Boolean[N];	// true: div , false:not div
		
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.parallelSort(a);

		int cnt = 0;
		ans[0] = false;
		for(int i = 1; i< N; i++) {
			if(a[i-1] == a[i])
				ans[i] = true;
		}
		
		
		for (int i = 0; i < N; i++) {
			if(ans[i] == true)
				break;
			for (int j = 0; j < N; j++) {
				if (a[i] != a[j] && a[j] > a[i] / 2) {
					break;
				}
				if (i != j) {
					if (a[i] % a[j] == 0) {
						ans[i] = true;
						break;
					}

				}
			}
		}
		for (int i = 0; i < N; i++) {
			if(!ans[i]) cnt++;
		}

		System.out.println(cnt);
	}
}
