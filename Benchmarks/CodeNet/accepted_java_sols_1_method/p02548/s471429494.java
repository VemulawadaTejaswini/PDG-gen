import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int N = scanner.nextInt();
		long ans = 0;
		
		for (int i = 1; i <= N; i++) {
			ans += (N-1) / i;
		}


		System.out.println(ans);
		scanner.close();
	}

}
