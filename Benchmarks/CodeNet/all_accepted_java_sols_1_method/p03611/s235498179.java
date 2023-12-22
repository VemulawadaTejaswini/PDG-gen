import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[100001];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			num[a]++;
		}
		
		int ans = 1;
		for (int x = 1; x < 99999; x++) {
			int cnt = num[x - 1] + num[x] + num[x + 1];
			ans = Math.max(ans, cnt);
		}
		
		System.out.println(ans);
	}
}
