import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		long M = Long.parseLong(sc.next());
		long K = Long.parseLong(sc.next());
		List<Long> countA = new ArrayList();
		List<Long> countB = new ArrayList();
		countA.add(0l);
		countB.add(0l);

		for(int i=1;i<=N;i++) {
			long a =Long.parseLong(sc.next());
			countA.add(countA.get(i-1)+a);
		}
		for(int i=1;i<=M;i++) {
			long b = Long.parseLong(sc.next());
			countB.add(countB.get(i-1)+b);
		}

		long maxCount = 0;
		for(int i=0;i<=N;i++) {
			int max = countB.size()-1;
			int min = 0;
			long a = countA.get(i);
			int aa = max;
			while(true) {
				if(aa == 0){
					if(a <= K) {
						maxCount = Math.max(maxCount, i);
					}
					break;
				} else if(aa == min) {
					maxCount = Math.max(maxCount, aa+i);
					break;
				}
				if(a+countB.get(aa) <= K) {
					min = aa;
				} else {
					max = aa;
				}
				aa = (max+min)/2;
			}
		}
		System.out.println(maxCount);

	}
}