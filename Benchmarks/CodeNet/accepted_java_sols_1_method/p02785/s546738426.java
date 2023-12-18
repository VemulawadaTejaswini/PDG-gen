import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int K = Integer.parseInt(scan.next());
		List<Long> numList = new ArrayList<Long>();
		long sum = 0;
		for(int i = 0; i < N; i++) {
			numList.add(Long.parseLong(scan.next()));
		}
		Collections.sort(numList, Collections.reverseOrder());
		if(N <= K) {
			System.out.println(sum);
			return;
		}
		for(int i = K; i < N; i++) {
			sum += numList.get(i);
		}
		System.out.println(sum);
	}
}