
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			x -= tmp;
			min = Math.min(min, tmp);
		}
		int ans = n + x / min;
		System.out.println(ans);
	}

}
