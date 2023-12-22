import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] input = new int[M][2];
		for (int i = 0; i < M; i++) {
			input[i][0] = sc.nextInt();
			String tmp = sc.next();
			if (tmp.equals("AC")) {
				input[i][1] = 1;
			} else {
				input[i][1] = 0;
			}
		}
		int resCorr = 0;
		int pena = 0;
		int[][] qa = new int[N][2];
		for (int i = 0; i < M; i++) {
			if (qa[input[i][0]-1][1] == 1) {
				continue;
			}
			if (input[i][1] == 0) {
				qa[input[i][0]-1][0]++;
			} else {
				resCorr++;
				pena += qa[input[i][0]-1][0];
				qa[input[i][0]-1][1] = 1;
			}
		}
		System.out.print(resCorr + " " + pena);
	}
}