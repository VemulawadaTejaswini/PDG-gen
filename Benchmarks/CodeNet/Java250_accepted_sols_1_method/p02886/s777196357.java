import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[] d1 = new int[N];
		for (int i = 0; i < N; i++) {
			d1[i] = scan.nextInt();
		}
		
		int[] d2 = new int[N];
		for (int i = 0; i < d1.length; i++) {
			d2[i] = d1[i];
		}
		
		int total = 0;
		for (int i = 0; i < d1.length; i++) {
			for (int j = 0; j < d2.length; j++) {
				if (i >= j) {
					continue;
				}
				total += d1[i] * d2[j];
			}
		}
		
		System.out.println(total);
	}
}