import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//??\???
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		long[][] C = new long[n][l];
		for (int ni=0; ni < n; ni++) {
			for (int mi=0; mi < m; mi++) {
				A[ni][mi] = sc.nextInt();
			}
		}
		for (int mi=0; mi < m; mi++) {
			for (int li=0; li < l; li++) {
				B[mi][li] = sc.nextInt();
			}
		}
		//?¨????
		for (int ni=0; ni < n; ni++) {
			for (int li=0; li < l; li++) {
				for (int mi=0; mi < m; mi++) {
					C[ni][li] += A[ni][mi] * B[mi][li];
				}
			}
		}
		//??????
		for (int ni=0; ni < n; ni++) {
			for (int li=0; li < l; li++) {
				System.out.print(C[ni][li]);
				if (li < l-1) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}