import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]s = new int[100001];
		for(int i = 0; i < N; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			for(int j = l; j <= r; j++) {
				s[j] = 1;
			}
		}
		sc.close();
		int cnt = 0;
		for(int i = 1; i <= 100000; i++) {
			if(s[i] == 1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}