import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int MOD = 1000000007;

	public static void main(String[] args) {
		exec_1_3();

	}

	public static void exec_1_3() {

		try(var sc = new Scanner(System.in)) {


			int N = sc.nextInt();

			long ans =0;
			for(int i=1;i<N;i++) {

				int m =  (N-1)/i;
				ans += m;
			}
			System.out.println(ans);
		}
	}
}