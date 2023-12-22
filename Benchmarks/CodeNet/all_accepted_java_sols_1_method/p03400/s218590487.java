import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		String[] tokens = in.nextLine().split(" ");
		int D = Integer.parseInt(tokens[0]);
		int X = Integer.parseInt(tokens[1]);
		int[] A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(in.nextLine());
		}
		int result = X;
		for (int i = 0; i < N; ++i) {
			result += Math.floorDiv(D - 1, A[i]) + 1;
		}
		System.out.println(result);
		in.close();

	}

}
