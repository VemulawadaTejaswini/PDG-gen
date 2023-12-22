import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
	  int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int l = Integer.parseInt(tmp.split(" ")[2]);
		long[][] A = new long[n][m];
		long[][] B = new long[m][l];
		long[][] rs = new long[n][l];

		for (int i = 0; i < n; i++) {
			String num = scan.nextLine();
			for (int j = 0; j < m; j++) {
				int tmpLine = Integer.parseInt(num.split(" ")[j]);
				A[i][j] = tmpLine;
			}
		}

		for (int i = 0; i < m; i++) {
			String num = scan.nextLine();
			for (int j = 0; j < l; j++) {
				int tmpLine = Integer.parseInt(num.split(" ")[j]);
				B[i][j] = tmpLine;
			}
		}

		long sum = 0;
		int cnt = 0;

		while (cnt < n) {
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < m; j++) {
					sum += A[cnt][j] * B[j][i];
				}
				rs[cnt][i] = sum;
				sum = 0;
			}
			cnt++;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				System.out.print(rs[i][j]);
				if(j != l - 1){
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}

