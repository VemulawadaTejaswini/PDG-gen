import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int a[] = new int[N + 1];
		int b[] = new int[N];
		for(int i = 0; i < N + 1; i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			b[i] = scan.nextInt();
		}
		
		long total = 0;
		for(int i = 0; i < N; i++) {
			if(b[i] <= a[i]) {
				total += b[i];
			}else {
				b[i] -= a[i];
				total += a[i];
				
				int nextBaster = Math.min(a[i + 1], b[i]);
				total += nextBaster;
				a[i + 1] -= nextBaster;
			}
		}
		
		System.out.println(total);
 	}
}
