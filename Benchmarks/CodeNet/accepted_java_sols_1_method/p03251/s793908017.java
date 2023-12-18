import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int minZ = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if (x > minZ)
				minZ = x;
		}
		minZ++;

		int maxZ = Integer.MAX_VALUE;
		for (int i = 0; i < M; i++) {
			int y = sc.nextInt();
			if (y < maxZ)
				maxZ = y;
		}
		sc.close();

		for (int i = minZ; i <= maxZ; i++) {
			if (X < i && i <= Y) {
				System.out.println("No War");
				return;
			}
		}

		System.out.println("War");
	}
}