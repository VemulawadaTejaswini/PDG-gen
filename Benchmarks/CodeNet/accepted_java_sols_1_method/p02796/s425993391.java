import java.util.Arrays;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] robot = new int[N][2];
		for(int i=0; i<N; i++) {
			int X = sc.nextInt();
			int L = sc.nextInt();

			robot[i][0] = X-L;
			robot[i][1] = X+L;
		}

		int ans = 0;

		Arrays.sort(robot, (a, b) -> a[1] - b[1]);

		int index = 0;
		int point = robot[0][1];
		while(index < N) {
			point = robot[index][1];
			ans++;
			index++;
			while(index < N && robot[index][0] < point)
				index++;
		}

		System.out.println(ans);
	}
}
