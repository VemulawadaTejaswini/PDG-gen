import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int s = sc.nextInt();
			if (n == 0) {
				break;
			}
			int ans = 0;
			for(int i=1;i<1<<n;i++) {
				if (Integer.bitCount(i) != k) {
					continue;
				}
				int sum = 0;
				for(int j=0;j<n;j++) {
					if ((i&1<<j)>0) {
						sum += j + 1;
					}
				}
				if (sum == s) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}

}