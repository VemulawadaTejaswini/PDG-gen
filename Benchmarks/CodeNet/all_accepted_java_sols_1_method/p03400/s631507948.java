import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int y = 0;
		for (int i = 0; i < N; i++) {
			int Ai = sc.nextInt();
			for (int j = 0; j < D; j++) {
				int e = j * Ai + 1;
				if (e <= D) {
					y++;
				
				}
			}
		}
		int answer = y + X;
		System.out.println(answer);
		sc.close();
	}
}