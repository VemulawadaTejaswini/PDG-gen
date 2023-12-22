
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] d = new int[100001];
			for (int i = 0; i < n; i++) {
				d[sc.nextInt()]++;
			}

			int tmp = 0;
			int cnt = 0;
			for (int i = 0; i < 100001; i++) {
				tmp += d[i];
				if (n == tmp * 2) {
					cnt++;
				} else if(n < tmp * 2) {
					break;
				}
			}
			System.out.println(cnt);
		}
	}
}
