
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] A = new int[3];
		A[0] = reader.nextInt();
		A[1] = reader.nextInt();
		A[2] = reader.nextInt();
		Arrays.sort(A);
		int ans = A[2] - A[1];
		A[0] += ans;
		ans += (A[2] - A[0]) / 2;
		if ((A[2] - A[0]) % 2 == 1) {
			ans+=2;
		}
		System.out.print(ans);
		reader.close();
	}
}

