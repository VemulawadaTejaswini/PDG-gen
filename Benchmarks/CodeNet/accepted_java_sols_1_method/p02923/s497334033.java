import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int h[] = new int[n];
		for ( int i = 0; i < n; i++ ) {
			h[i] = in.nextInt();
		}
		
		HashSet<Integer> cnts = new HashSet<>();
		int cnt = 0;
		for ( int i = 1; i < h.length; i++ ) {
			if(h[i-1] >= h[i]) {
				cnt++;
			} else {
				cnts.add(cnt);
				cnt = 0;
			}
		}
		cnts.add(cnt);

		System.out.println(Collections.max(cnts));
		in.close();

	}

}