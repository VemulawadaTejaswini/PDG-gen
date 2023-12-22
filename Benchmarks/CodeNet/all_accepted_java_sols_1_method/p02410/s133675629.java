import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//??\?????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] A = new int[n][m];
		int[] b = new int[m];
		int[] c = new int[n];
		for (int ni = 0; ni < n; ni++) {
			for (int mi = 0; mi < m; mi++) {
				A[ni][mi] = sc.nextInt();
			}
		}
		for(int mi = 0; mi < m; mi++) {
			b[mi] = sc.nextInt();
		}
		//?¨????
		for (int mi = 0; mi < m; mi++) {
			for (int ni = 0; ni < n; ni++) {
				c[ni] += A[ni][mi] * b[mi];
			}
		}
		//??????
		for (int ni = 0; ni < n; ni++){
			System.out.println(c[ni]);
		}
	}

}