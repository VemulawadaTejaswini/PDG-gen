import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		long M = Long.parseLong(sc.next());
		long K = Long.parseLong(sc.next());
		List<Long> list = new ArrayList();

		for(int i=0;i<N;i++) {
			list.add(Long.parseLong(sc.next()));
		}
		for(int i=0;i<M;i++) {
			list.add(Long.parseLong(sc.next()));
		}
		Collections.sort(list);
//		long count = 0;
		for(int i=0;i<=list.size();i++) {
			if(i==list.size()) {
				System.out.println(i);
				break;
			}
			long a = list.get(i);
			if(a <= K) {
//				count ++;
				K -= a;
			} else {
				System.out.println(i);
				break;
			}
		}

	}
}