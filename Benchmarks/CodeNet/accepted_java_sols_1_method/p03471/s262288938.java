import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  // count
		int Y = sc.nextInt();  // total
		
		for (int x=0; x<=N; x++) {
			for (int y=0; y<=N; y++) {
				int z = N - (x+y);
				if (z < 0) continue;
				if ( (10000*x + 5000*y + 1000*z) == Y ) {
					System.out.println( String.format("%d %d %d", x, y, z) );
					return;
				}
			}
		}
		System.out.println( "-1 -1 -1" );
	}
}
