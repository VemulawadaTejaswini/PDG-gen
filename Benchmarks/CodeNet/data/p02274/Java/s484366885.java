import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		final int n = scan.nextInt();
		long count = 0;
		
		int[] sequence = new int[n];
		
		for (int i = 0; i < n; i++) {
			sequence[i] = scan.nextInt();
		}
		scan.close();
		
		for (int i : sequence) {
			count += (long)Inversions(i - 1, sequence, n);
		}
		
		System.out.println(count);
		
	}
	
	static int Inversions (int i, int[] sequence, int n) {
		int cnt = 0;
		
		for (int j = i + 1; j < n; j++) {
			if ( sequence[i] > sequence[j]) {
				cnt++;
			}
		}
		
		return cnt;
	}
}

