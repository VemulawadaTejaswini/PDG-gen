import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		int[][] point = new int[N][D];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				point[i][j] = Integer.parseInt(sc.next());
			}
		}
		int count = 0;
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {
				int distance_square = 0;
				for (int k = 0; k < D; k++) {
					int distance = point[i][k] - point[j][k];
					distance_square += distance * distance;
				}
				int distance_sqrt = (int) Math.sqrt(distance_square);
				if(distance_sqrt * distance_sqrt == distance_square) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}