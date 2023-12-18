import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] h = new int[n];
		for ( int i = 0; i < h.length; i++ ) {
			h[i] = in.nextInt();
		}

		int base = h[0];
		for ( int i = 0; i < h.length; i++ ) {
			if ( base < h[i] ) base = h[i];

			if ( base - 1 > h[i] ) {
				System.out.println("No");
				in.close();
				return;
			}
		}

		System.out.println("Yes");
		in.close();

	}
}