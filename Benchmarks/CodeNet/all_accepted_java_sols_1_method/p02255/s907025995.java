import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		String line2 = sc.nextLine();
		String[] kari = line2.split(" ");
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(kari[i]);
		}
		
		System.out.println(line2);

		int v = 0;
		int j = 0;

		for (int i = 1; i < n; i++) {
			v = A[i];
			j = i - 1;
			while (j >= 0 && A[j] > v) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;

			for (int k = 0; k < n - 1; k++) {
				System.out.print(A[k]);
				System.out.print(" ");
			}
			System.out.println(A[n - 1]);

		}

	}

}