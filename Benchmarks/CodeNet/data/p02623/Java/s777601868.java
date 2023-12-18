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

		long countMax = 0;
		int bMax = countB.size()-1;
		for(int i=0;i<=N;i++){
			while(true){
				if(bMax<0)break;
				if(countA.get(i)+countB.get(bMax)<=K){
					countMax = Math.max(i+bMax, countMax);
					break;
				}
				bMax--;
			}
		}
		System.out.println(countMax);
	}
}
