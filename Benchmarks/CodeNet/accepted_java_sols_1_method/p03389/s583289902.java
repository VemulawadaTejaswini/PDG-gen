
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = Math.max(a, Math.max(b, c));
		int min = Math.min(a, Math.min(b, c));
		int mid = a + b + c - max - min;
		int ans = 0;
		int tmp = (max - min) / 2;
		min += 2 * tmp;
		ans += tmp;
		tmp = (max - mid) / 2;
		mid += 2 * tmp;
		ans += tmp;
		if(max != min && max != mid) {
			ans++;
		} else if(!(max == min && max == mid)) {
			ans += 2;
		}
		System.out.println(ans);
	}

}
