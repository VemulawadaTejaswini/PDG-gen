import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++ ) {
			A[i] = scan.nextInt();
		}
		scan.close();
		int r = bubbleSort(A, N);
		for(int i=0; i<=N-1; i++) {
			if(0<i) {
				System.out.print(" ");
			}
			System.out.print(A[i]);
		}
		System.out.println();
		System.out.println(r);

	}

	public static int bubbleSort(int[] A, int N) {
		int replaceCount = 0;
		boolean flag = true; // 逆の隣接要素が存在する
		while(flag) {
			flag = false;
			for(int j=N-1; j>=1; j--) {
				if(A[j] < A[j-1]) {
					int t = A[j];
					A[j] = A[j-1];
					A[j-1] = t;
					flag = true;
					replaceCount++;
				}
			}
		}
		return replaceCount;
	}

}

