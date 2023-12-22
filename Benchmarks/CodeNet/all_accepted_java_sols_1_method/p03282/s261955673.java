import java.util.Scanner;

public class Main {
	static int[] subTreeSize;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final long D = (long) (5 * Math.pow(10, 15));
		String s = sc.next();
		long k = sc.nextLong();
		long sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int n = Integer.parseInt(s.substring(i, i + 1));
			sum += Math.pow(n, D);
			if (k <= sum) {
				System.out.println(n);
				sc.close();
				return;
			}
		}
		
		sc.close();
	}
}
