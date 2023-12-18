import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0;i<N;i++){pq.add(sc.nextDouble());}
		for(int i=0;i<M;i++){
			pq.add(pq.poll()/2);
		}
		Long ans =0L;
		for(int i=0;i<N;i++){
			ans += Math.round(pq.poll()-0.5);
		}
		System.out.println(ans);
		sc.close();
	}
		
}
