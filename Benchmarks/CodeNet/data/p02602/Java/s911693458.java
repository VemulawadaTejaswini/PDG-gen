import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		List<Long> score = new ArrayList();
		List<Long> hantei = new ArrayList();
		Queue<Long> que = new ArrayDeque();
		for(int i=0; i<N; i++) {
			long a = Long.parseLong(sc.next());
			score.add(a);
			que.add(a);
			if(que.size()>K) {
				que.poll();
				long hanteiScore = 1;
				for(Long b : que) {
					hanteiScore *= b;
				}
				hantei.add(hanteiScore);
			} else {
				hantei.add(0L);
			}
		}
		for(int aa = 0; aa<hantei.size();aa++) {
			if(hantei.get(aa) == 0)continue;
			if(hantei.get(aa-1) < hantei.get(aa)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
//		long lastScore = 1;
//		for(int i = K; i<score.size();i++) {
//			if(lastScore ==1) {
//				for(int j=i-1; j>(i-K-1);j--) {
//					lastScore *= score.get(j);
//				}
//			}
//			long thisScore = 1;
//			for(int j=i; j>(i-K);j--) {
//				thisScore *= score.get(j);
//			}
//			if(lastScore < thisScore) {
//				System.out.println("Yes");
//			} else {
//				System.out.println("No");
//			}
//			lastScore = thisScore;
//		}

	}
}