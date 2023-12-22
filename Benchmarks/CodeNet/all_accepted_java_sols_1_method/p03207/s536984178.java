
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		int max = 0;
		for(int i = 0; i < N; i++) {
			int tmp = sc.nextInt();
			ans += tmp;
			max = Math.max(max, tmp);
		}
		ans -= max / 2;
		System.out.println(ans);
	}

}
