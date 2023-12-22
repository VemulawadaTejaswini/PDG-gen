import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		int tmp = x / 500;
		x -= tmp * 500;
		int ans = tmp * 1000;
		tmp = x / 5;
		ans += tmp * 5;
		System.out.println(ans);
	}
}
