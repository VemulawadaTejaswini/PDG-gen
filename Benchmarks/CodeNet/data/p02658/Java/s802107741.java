import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] An = new long [N];
		int i = 0;
		long product = 1, max = (long)1e18;
		for(i = 0; i<An.length; i++) {
			An[i] = sc.nextLong();
			if (An[i] == 0) {
				System.out.println(0);
				System.exit(0);
			}
		} 
		
		for (i = 0; i<An.length; i++) {
			if (product * An[i] >max) {
				System.out.println(-1);
				System.exit(0);
			}
			product *= An[i];
		}
		System.out.println(product);
	}

}
