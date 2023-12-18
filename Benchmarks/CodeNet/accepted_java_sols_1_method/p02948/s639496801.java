import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			B[i]=sc.nextInt();
		}
		
		Queue<Integer> pq = new PriorityQueue<Integer>((i1,i2)->i2-i1);
		
		int C[][] =  new int[N][2];
		for(int i=0;i<N;i++) {
			C[i][0]=A[i];
			C[i][1]=B[i];
		}
		Arrays.sort(C,(c1,c2)->c1[0]-c2[0]);//Aの昇順に並んでいる
		
		long ans = 0;
		int j=0;
		for(int i=1;i<=M;i++) {
			while(j<N && C[j][0]<=i) {
				pq.offer(C[j][1]);
				j++;
			}
			if(!pq.isEmpty()) ans += pq.poll();
		}
		System.out.println(ans);
	}
}