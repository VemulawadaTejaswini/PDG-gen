import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long A[]=new long[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextLong();
		}
		Arrays.parallelSort(A);
		long res=0;
		for(int i=1;i<N;i++) {
			res+=A[i];
		}
		System.out.println(res);
		sc.close();
	}
}