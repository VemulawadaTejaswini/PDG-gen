import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder output = new StringBuilder();
		
		int n = scan.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
		}
		for (int i = n-1; i > 0; i--) {
			output.append(a[i]).append(" ");
		}
		output.append(a[0]);
		System.out.println(output);
	}

}