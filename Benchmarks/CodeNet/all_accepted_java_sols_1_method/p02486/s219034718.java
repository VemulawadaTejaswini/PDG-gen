import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x, cnt;
		while(true) {
			cnt = 0;
			n = sc.nextInt();
			x = sc.nextInt();
			if(n == 0 && x == 0) break;
			if(n >= 3 && n <= 100) {
				for(int i=1; i<=n; i++) {
					for(int j=i+1; j<=n; j++) {
						for(int k=j+1; k<=n; k++) {
							if(i+j+k == x) {
								cnt++;
								continue;
							}
						}
					}
				}
				System.out.println(cnt);
			}
		}
	}
}