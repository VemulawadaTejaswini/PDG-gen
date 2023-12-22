import java.util.*;
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt(),A[] = new int[N],C[] = new int[N],i;
		for(i=0;i<N;i++) {
			A[i]=sc.nextInt();
			C[i]=A[i];
		}
		Arrays.sort(C);
		for(i=0;i<N;i++) System.out.println(A[i]==C[N-1]?C[N-2]:C[N-1]);
	}
}