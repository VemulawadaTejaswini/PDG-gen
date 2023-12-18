import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean over = false;
		long ans = 1;
		for(int i = 0; i < N; i++) {
			ans *= sc.nextLong();
			if(ans > 1_000_000_000_000_000_000L) {
				over = true;
				ans = 1;
			}
		}
		if(over && ans != 0)
			System.out.println(-1);
		else
			System.out.println(ans);
	}

}
