import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N, max = 0, arr[] = new int[3];
		N = in.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++)
				arr[j] = in.nextInt();
			for (int j = 1; j < 3; j++)
				if (arr[j] > max)
					max = j;
			if (arr[max] * arr[max] == (arr[0] * arr[0] + arr[1] * arr[1]
					+ arr[2] * arr[2] - arr[max] * arr[max]))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}