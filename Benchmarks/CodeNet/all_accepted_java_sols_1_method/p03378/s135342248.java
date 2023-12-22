import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		HashSet<Integer> A = new HashSet<Integer>();
		for (int i = 0; i < M; i++)
			A.add(sc.nextInt());
		sc.close();

		int ansLeft = 0;
		int ansRight = 0;

		for (int i = X; i >= 0; i--)
			if (A.contains(i))
				ansLeft++;
		for (int i = X; i <= N; i++)
			if (A.contains(i))
				ansRight++;

		System.out.println(Math.min(ansLeft, ansRight));
	}
}