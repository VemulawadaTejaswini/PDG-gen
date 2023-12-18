import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		//配列array
		int n = src.nextInt();
		int[] array = new int[n];
		for (int i=0; i<n; i++)
			array[i] = src.nextInt();

		int q = src.nextInt();
		for(int i=0; i<n; i++) {
//			System.out.print(array[i] + "debug");
		}

		for(int i=0; i<q; i++) {

			int b = src.nextInt();
			int e = src.nextInt() - 1;

			for(int j=0; j<(e+1 - b) / 2; j++) {
				int tmp = array[b+j];
				array[b+j] = array[e-j];
				array[e-j] = tmp;

			}
		}
		for(int i=0; i<n-1; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(array[n-1]);
	}
}
