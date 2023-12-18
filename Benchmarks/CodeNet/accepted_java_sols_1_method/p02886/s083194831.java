import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int[] takos = new int[n];
		for(int i = 0; i < n; i++) {
			takos[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				ans += takos[i] * takos[j];
			}
		}
		System.out.println(ans);
		

	}

}
