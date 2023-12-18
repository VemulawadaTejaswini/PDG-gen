import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int []a = new int[n];

		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		int xor = a[0];
		for (int i=1; i<n; i++){

			xor ^= a[i];
		}

		StringBuffer sb = new StringBuffer();
		for (int i=0; i<n; i++){

			if (i > 0) {
				sb.append(" ");
			}
			sb.append(xor ^ a[i]);
		}
		System.out.println(sb.toString());
	}

}