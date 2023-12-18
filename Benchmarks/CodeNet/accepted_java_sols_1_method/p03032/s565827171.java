import java.util.*;
public class Main { //atcoder ABC128D -

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int n = seer.nextInt(); int k = seer.nextInt();
		long[] vals = new long[n];
		for(int i = 0; i < n; i++){
			vals[i] = seer.nextInt();
		}
		long max = 0;
		for(int i = 0; i <= k; i++){ //picking i jewels in total
			for(int j = 0; j <= i; j++){ // the rightmost from the left side is the jth one
				PriorityQueue<Long> q = new PriorityQueue<>();
				for(int s = 0; s < j && s < n; s++){
					q.add(vals[s]);
				}
				for(int s = 0; s < (i-j) && s+j < n; s++){
					q.add(vals[n-s-1]);
				}
				for(int s = 0; s < (k-i) && !q.isEmpty(); s++){
					long hey = q.poll();
					if(hey > 0) {
						q.add(hey); break;
					}
				}
				long curr = 0;
				for(long v: q){
					curr += v;
				}
				max = Long.max(max, curr);
			}
		}
		System.out.println(max);
	}
}
