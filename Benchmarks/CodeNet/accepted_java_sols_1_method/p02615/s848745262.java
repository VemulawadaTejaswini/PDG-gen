import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		List<Long> list = new ArrayList();
		long total = 0L;
		for(long i=1; i<=N; i++) {
			list.add(Long.parseLong(sc.next()));
		}
		Collections.sort(list);
		Collections.reverse(list);
		long aa = N/2;
		long aaa = N%2;
		total = list.get(0);
		for(int i=1;i<=aa-1;i++) {
			total += list.get(i) * 2;
		}
		if(aaa ==1) {
			total += list.get((int) ((N/2)));
		}

		System.out.println(total);


	}
}