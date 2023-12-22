import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();
		int ans = a + b;
		int tmp = a - b;
		ans = Math.max(ans, tmp);
		tmp = a * b;
		ans = Math.max(ans, tmp);
		System.out.println(ans);
	}
}
