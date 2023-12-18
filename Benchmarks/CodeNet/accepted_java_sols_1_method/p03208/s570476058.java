import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String[] nk = sc.nextLine().split(" ");

		int N = Integer.parseInt(nk[0]);
		int K = Integer.parseInt(nk[1]);

		List<Integer> h = new ArrayList<>();
		for(int i=0;i<N;i++) {
			h.add(sc.nextInt());
		}

		Collections.sort(h);
		int min = Integer.MAX_VALUE;

		for(int i=0;i<=(N-K);i++) {
			if(min > (h.get(i+K-1) - h.get(i))) {
				min = (h.get(i+K-1) - h.get(i));
			}
		}

		System.out.println(min);
	}
}
