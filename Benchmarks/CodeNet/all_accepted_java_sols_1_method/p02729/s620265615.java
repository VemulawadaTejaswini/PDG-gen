import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();

		int fromN = N * (N - 1) / 2;
		int fromM = M * (M - 1) / 2;
		System.out.println(fromN + fromM);
	}
}
