import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		int ans = 0;
		for (int i = 1 ; i <= N ; i++) {
			if ( i % 2 == 1) {
				int cnt = 0;
				for (int j = 1 ; j <= i ; j++) {
					if (i % j == 0) {
						cnt++;
					}
				}
				if (cnt == 8) {
					ans++;
				}
			}
		}
		
		System.out.print(ans); 
	}
}
