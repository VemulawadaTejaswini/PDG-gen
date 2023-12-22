import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] R = new int[n];
		for (int i=0; i < n; i++) {
			R[i] = sc.nextInt();
		}
//
//		int max = R[1] - R[0];
//		for (int i =0; i < n-1; i++) {
//			for (int j=i+1; j < n; j++) {
//				if (max < R[j] - R[i])
//				max = R[j] - R[i];
//			}
//		}
//
//		System.out.println(max);

		int max = R[1] - R[0];
		int i = 0;
		for ( int j=1; j < n; j++) {
			if ( R[j] - R[i] > max ) {
				max = R[j] - R[i];
			}
			if ( R[i] > R[j] ) {
				R[i] = R[j];
			}
		}

		System.out.println(max);

	}

}