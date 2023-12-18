import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long A[]=new long[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextLong();
		}sc.close();
		Arrays.parallelSort(A);
		long res=0;
		Deque<Long> deque = new ArrayDeque<>();
		for(int i=N-1;i>=0;i--) {
			deque.add(A[i]);
			if(i!=N-1) {
				if(A[i]!=deque.peek()) {
					System.out.println(deque.peek());
					res+=deque.poll();
				}else {
					res+=A[i];
					System.out.println(A[i]);
				}
			}
		}
		System.out.println(res);
	}
}