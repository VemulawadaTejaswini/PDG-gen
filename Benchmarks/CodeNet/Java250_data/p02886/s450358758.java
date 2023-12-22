import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//たこ焼きの数
		int n = scan.nextInt();
		
		int [] s  = new int[50];
		for(int i  = 0; i < n ; i++) {
			s[i] = scan.nextInt();
		}
		// 体力
		int ans = 0;

		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				//体力の回復量
				ans += s[i] * s[j];
			}
		}

		System.out.println(ans);
	}
}