
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 0;
		
		for (int i = 1; i <= n; i += 2) {
			int tmp = 0;
			for (int j = 1; j * j <= i; j++) {
				if (i % j == 0) {
					if (j * j == i) tmp++;
					else tmp += 2;
				}
			}
			if (tmp == 8) cnt++;
		}
		
		System.out.println(cnt);
		
	}

}
