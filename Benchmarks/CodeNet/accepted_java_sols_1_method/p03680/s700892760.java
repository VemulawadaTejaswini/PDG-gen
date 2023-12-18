import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int[] a = new int[N+1];
		int ans = 0;
		
		for (int i= 1; i <= N; i++){
			a[i] = sc.nextInt();
		}
		int x = 1;
		while (ans < N){
			x = a[x];
			ans++;
			if (x == 2) {
				System.out.println(ans);
				sc.close();
				return;
			}
		}
		
		System.out.println("-1");
		sc.close();
	}
}
