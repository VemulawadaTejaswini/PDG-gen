import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] height =new long[N];
		long con = 0;

		for (int i = 0; i < N; i++) {
			height[i] = sc.nextLong();
		}

		for (int i = 1; i < N; i++) {
			if (height[i-1] > height[i]) {
				long let =height[i-1] - height[i];
				height[i] += let;
				con += let;
			}
		}

		System.out.println(con);


	}

}