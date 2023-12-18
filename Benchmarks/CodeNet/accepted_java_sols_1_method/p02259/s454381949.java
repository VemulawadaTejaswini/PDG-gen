import java.util.Scanner;

public class Main {
	
	public static void  main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int tmp;
		int count = 0;
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i=0; i<N; i++){
			for (int j=N-1; j>0; j--){
				if(A[j] < A[j-1]) {
					tmp = A[j];
					A[j] = A[j-1];
					A[j-1] = tmp;
					count++;
				}
			}
		}
		
		for (int i=0; i<N-1; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println(A[N-1]);
		System.out.println(count);
	}
}

