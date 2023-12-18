import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] tenboudai = new int[N+1];
		for (int i = 0; i < N; i++) {
			tenboudai[i+1] = sc.nextInt();
		}
		HashSet<Integer> daturaku = new HashSet<Integer>();
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (tenboudai[a] == tenboudai[b]) {
				daturaku.add(a);
				daturaku.add(b);
			} else {
				if(tenboudai[a] < tenboudai[b]) {
				daturaku.add(a);
				}else {
					daturaku.add(b);
				}

			}
		}
		System.out.print(tenboudai.length - daturaku.size()-1);

	}
}