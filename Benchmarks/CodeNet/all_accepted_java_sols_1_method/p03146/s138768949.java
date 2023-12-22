import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cur = sc.nextInt();
		int ans = 0;
		boolean used[] = new boolean[1000000 + 1];

		while(true) {
			ans += 1;
			if(used[cur]) {
				System.out.println(ans);
				return;
			} else {
				used[cur] = true;
				cur = cur % 2 == 0 ? cur / 2 : 3 * cur + 1;
			}
		}
	}
}