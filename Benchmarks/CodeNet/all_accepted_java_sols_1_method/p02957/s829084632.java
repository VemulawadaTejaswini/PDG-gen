import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();
		int ans = 0;
		String err = "IMPOSSIBLE";
		boolean error = false;
		if(a != b) {
			if(a % 2 != b % 2) {
				error = true;
				System.out.println(err);
			}
			ans = (a + b) / 2;
		}
		if(!error)
		System.out.println(ans);
	}
}
