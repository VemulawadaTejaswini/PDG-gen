import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String[] line1b = line1.split(" ");
		int n = Integer.parseInt(line1b[0]);
		int m = Integer.parseInt(line1b[1]);
		int l = Integer.parseInt(line1b[2]);

		String[] A = new String[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextLine();
		}

		String[] B = new String[m];

		for (int i = 0; i < m; i++) {
			B[i] = sc.nextLine();
		}

		for (int i = 0; i < n; i++) {
			String[] A_kari = A[i].split(" ");
			int[] A_int = new int[m];
			for (int j = 0; j < m; j++) {
				A_int[j] = Integer.parseInt(A_kari[j]);
			}
			for (int j = 0; j < l; j++) {
				int[] B_int = new int[m];
				for (int k = 0; k < m; k++) {
					String[] B_kari = B[k].split(" ");
					B_int[k] = Integer.parseInt(B_kari[j]);
				}
				int sum = 0;
				for (int p = 0; p < m; p++) {
					sum += A_int[p] * B_int[p];
				}
				System.out.print(sum);
				if (j != l-1) {
					System.out.print(" ");
				}
			}
			System.out.println("");

		}

	}

}