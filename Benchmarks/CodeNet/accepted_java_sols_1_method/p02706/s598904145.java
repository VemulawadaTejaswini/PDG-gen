
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int ans=0;
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		for(int i=0; i<M; i++) {
			int A = scanner.nextInt();
			ans = ans + A;
		}

		ans = N - ans;
		if(ans >= 0) {
			System.out.println(ans);
		}else {
			System.out.println(-1);
		}

		scanner.close();


	}

}
