import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		long M = Long.parseLong(sc.next());
		long K = Long.parseLong(sc.next());
//		List<Long> listA = new ArrayList();
		List<Long> countA = new ArrayList();
//		List<Long> listB = new ArrayList();
		List<Long> countB = new ArrayList();

		for(int i=0;i<N;i++) {
			long a =Long.parseLong(sc.next());
//			listA.add(a);
			if(i!=0) {
				countA.add(countA.get(i-1)+a);
			} else {
				countA.add(a);
			}
		}
		for(int i=0;i<M;i++) {
			long b = Long.parseLong(sc.next());
//			listB.add(b);
			if(i!=0) {
				countB.add(countB.get(i-1)+b);
			} else {
				countB.add(b);
			}
		}

		long maxCount = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(countA.get(i) + countB.get(j) > K) {
					break;
				}
				maxCount = Math.max(maxCount, i+1+j+1);
			}
		}

		System.out.println(maxCount);
	}
}