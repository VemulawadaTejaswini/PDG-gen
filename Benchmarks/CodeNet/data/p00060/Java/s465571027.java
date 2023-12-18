import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			boolean[] c = new boolean[11];
			Arrays.fill(c, true);
			c[0] = false;
			int C1 = sc.nextInt();
			int C2 = sc.nextInt();
			int C3 = sc.nextInt();
			c[C1] = false;
			c[C2] = false;
			c[C3] = false;
			int sum = C1 + C2;
			int cnt = 0;
			for(int i = 1; i <= 9; i++) {
				if(c[i] && sum + i <= 15) {
					cnt++;
				}
			}
			if(cnt >= 4) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
