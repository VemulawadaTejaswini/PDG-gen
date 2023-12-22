import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int[] aji = new int[N];
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			aji[i] = L + i;
			sum += aji[i];
		}
		
		int[] ans = new int[N];
		int sa = 1000000000;
		int x = 0;
		
		for(int i = 0; i < N; i++) {
			ans[i] = sum - aji[i];
			if(sa > Math.abs(sum - ans[i])) {
				sa = Math.abs(sum - ans[i]);
				x = i;
			}
		}
		
		System.out.println(ans[x]);
	}
}
