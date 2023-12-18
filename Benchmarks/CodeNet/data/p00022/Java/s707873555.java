import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int n = scan.nextInt();
			if(n == 0) break;

			int[] a = new int[n];
			int[] b = new int[n];
			int input = 0;
			int max = Integer.MIN_VALUE;

			for(int i = 0 ; i < n ; i++) {
				a[i] = scan.nextInt();
				b[i] = a[i] + input;
				input = b[i];
			}

			for(int k = 0 ; k < n ; k++) {
				if(b[k] > max) {
					max = b[k];
				}
				for(int j = 0 ; j < k ; j++) {
					if(b[k] - b[j] > max) {
						max = b[k] - b[j];
					}
				}
			}
			System.out.println(max);
		}
	}

}
