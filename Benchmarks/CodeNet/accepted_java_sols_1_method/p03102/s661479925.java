import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		ArrayList<Integer> listB = new ArrayList<>();
		int[][] listA = new int[N][M];
		for(int i = 0; i< M; i++) {
			listB.add(Integer.parseInt(sc.next()));
		}
		for(int i = 0; i< N; i++) {
			for(int j = 0; j < M; j++) {
				listA[i][j] = Integer.parseInt(sc.next());
			}
		}
		sc.close();

		int count = 0;
		for(int i = 0; i < N; i++) {
			int tmp = C;
			for(int j = 0; j < M; j++) {
				tmp += listA[i][j] * listB.get(j);
			}
			if(tmp > 0) count++;
		}

		System.out.println(count);
	}

}
