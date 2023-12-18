import java.io.IOException;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();		

		PriorityQueue<Integer> a = new PriorityQueue<>();
		for ( int i = 0; i < n; i++ ) {
			a.add(in.nextInt());
		}

		int[][] bc = new int[m][2];
		for ( int i = 0; i < m; i++ ) {
			bc[i][0] = in.nextInt();
			bc[i][1] = in.nextInt();
		}		

		Arrays.sort(bc, (o1, o2) -> o2[1] - o1[1]);

		for ( int i = 0; i < m; i++ ) {
			while ( !a.isEmpty() && a.peek() < bc[i][1] && 0 < bc[i][0] ) {
				a.poll();
				a.add(bc[i][1]);
				bc[i][0]--;
			}
		}
		
		long ans = 0L;
		for ( Integer i : a ) {
			ans += i;
		}
		System.out.println(ans);
		in.close();
	}
}