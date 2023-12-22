import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		boolean[] flgM = new boolean[N];
		int[] intN = new int[N];
		boolean NG = false;
		for(int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();

			if(flgM[s-1] == false || intN[s-1] == c) {
				intN[s-1] = c;
				flgM[s-1] = true;
			} else {
				NG = true;
			}
		}
		if(NG) {
			System.out.println(-1);
		} else {
			int result = 0;
			int kakeru = 1;
			for(int i = N-1; i >= 0; i--) {
				result = result + intN[i] * kakeru;
				if(N > 1 && i == 0 && flgM[i] == false) result = result + 1 * kakeru;
				kakeru = kakeru * 10;
			}
			if(String.valueOf(result).length() != N) {
				result = -1;
			}
			System.out.println(result);
		}
	}

}