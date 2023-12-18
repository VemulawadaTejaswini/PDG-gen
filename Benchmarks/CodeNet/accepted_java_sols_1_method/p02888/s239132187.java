import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] l = new Integer[n];
		for ( int i = 0; i < n; i++ ) {
			l[i] = in.nextInt();
		}
		Arrays.sort(l, Comparator.reverseOrder());

		int cnt = 0;
		for ( int p = 0; p < n; p++ ) {
			for ( int c = p + 1; c < n; c++ ) {
				int d = l[p] - l[c];
				for ( int i = c + 1; i < n; i++ ) {
					if ( l[i] > d ) cnt++;
					else break;
				}
			}
		}
		System.out.println(cnt);
		in.close();
	}
}