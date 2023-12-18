import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0077
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			
			int x = N / 2, y = N / 2 + 1;
			int[][] mc = new int[N][N];
			for (int i = 0; i < N; i++) fill(mc[i], -1);
			for (int i = 0; i < N * N; i++)  {
				if (mc[(y + i) % N][(x + i) % N] != -1) {
					y++; x--;
				}
				mc[(y + i) % N][(x + i) % N] = i + 1;
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.printf("%4d", mc[i][j]);
				}
				System.out.println();
			}
			
		}
	}	
}