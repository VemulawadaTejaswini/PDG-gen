import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			int N = sc.nextInt();
			if( N == 0 ) break;
			
			int a[] = new int[N];
			for(int i = 0; i < N; i++) a[i] = sc.nextInt();
			
			System.out.println( mss(a) );
		}
	}
	
	static int mss(int a[]) {
		int best = a[0];
		int tail = a[0];
		for(int i = 1; i < a.length; i++) {
			tail = Math.max(tail + a[i], a[i]);
			best = Math.max(best, tail);
		}
		return best;
	}

}