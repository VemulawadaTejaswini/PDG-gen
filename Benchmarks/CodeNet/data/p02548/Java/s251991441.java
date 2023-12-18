import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int N = scanner.nextInt();
		long ans = 0;
		for (int i = 1; i < N; i++) {
			int M = N-i;
			for (int j = 1; j <= Math.sqrt(M); j++) {
				if (M % j == 0) {
					if ((M / j) == j) {
						ans++;
					}else{
						ans += 2;
					}
				}
			}
		}

		System.out.println(ans);
		scanner.close();
	}

}
