import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), d = sc.nextInt();
		sc.close();
		int tmp = 2 * d + 1;
		int r = n % tmp;
		int ans = n /tmp;
		if(r != 0)
			ans++;

		System.out.println(ans);
	}
}
