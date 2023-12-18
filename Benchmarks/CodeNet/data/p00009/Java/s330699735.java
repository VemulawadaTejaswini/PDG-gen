import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n, cnt;

		while(true) {
			n = sc.nextInt();
			cnt = 0;

			for(int i = 2; i <= n; i++) {
				for(int j = 2; j <= i; j++) {
					if(i == j) {
						cnt++;
					} else if(i % j == 0) {
						break;
					}
				}
			}

			System.out.println(cnt);
		}
	}
}