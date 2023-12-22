import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		List<Long> hi = new ArrayList<Long>();
		for(int i=0; i<n; ++i) {
			hi.add((long) scan.nextInt());
		}

		if(n <= k) {
			System.out.println("0");
		} else {
			Collections.sort(hi, Collections.reverseOrder());

			for(int i=0; i<k; ++i) {
				hi.set(i, (long) 0);
			}
			long sum = 0;
			for(int i=k; i<n; ++i) {
				sum += hi.get(i);
			}
			System.out.println(sum);
		}
	}
}