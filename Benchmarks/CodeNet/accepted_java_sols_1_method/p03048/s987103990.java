
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		int ans = 0;
		for (int i=0;i<=n;i++) {
			for (int j=0;j<=n;j++) {
				if (i*r+j*g<= n && (n-i*r-j*g)%b == 0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
