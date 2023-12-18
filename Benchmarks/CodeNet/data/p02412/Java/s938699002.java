import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i;
		int j;
		int k;

		while(true) {

			int total = 0;
			int cnt = 0;

			int n = sc.nextInt();
			int x = sc.nextInt();

			if((n == 0) && (x == 0)) {
				break;
			}

			for(i = 1; i <= n - 2; i++) {
				for(j = i + 1; j <= n - 1; j++) {
					for(k = j + 1; k <= n; k++) {

						total= i + j + k;

						if(total == x) {
							cnt++;
						}

					}
				}
			}
			System.out.println(cnt);

		}

	}
}