import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] V = new int[N];
		for (int i=0;i<N;i++) {
			V[i]=sc.nextInt();
		}

		long ans=0L;
		for (int i=0;i<Math.min(N,K)+1;i++) {
			for (int j=0;j<Math.min(N,K)-i+1;j++) {
				long value=0L;
				Queue<Integer> pq = new PriorityQueue<Integer>();
				for (int k=0;k<i;k++) {
					value+=V[k];
					pq.add(V[k]);
				}
				for (int k=N-1;k>N-j-1;k--) {
					value+=V[k];
					pq.add(V[k]);
				}
				for (int k=0;k<K-i-j;k++) {
					if (pq.isEmpty()) {
						break;
					}
					int tmp=pq.remove();
					if (tmp<0) {
						value-=tmp;
					} else {
						break;
					}
				}
				ans=Math.max(ans,value);
			}
		}
		System.out.println(ans);
	}
}