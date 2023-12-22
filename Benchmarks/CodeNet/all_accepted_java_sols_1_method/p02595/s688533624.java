import java.util.*;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long D = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < N; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			if (Math.sqrt((x*x) + (y*y)) <= D)
				ans++;
		}
		System.out.println(ans);
	}
}