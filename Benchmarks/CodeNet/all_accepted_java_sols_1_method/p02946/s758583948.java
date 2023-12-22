import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int X = sc.nextInt();
		int A[] = new int[100];
		int B[] = new int[100];
		int p_cnt = X+1;
		int m_cnt = X-1;

		for(int i=0;i<K-1;i++) {
			A[i] = p_cnt++;
			B[i] = m_cnt--;
		}
		

		for(int j=K-2;j>=0;j--) System.out.print(B[j]+" ");
		System.out.print(X+" ");
		for(int k=0;k<(K-1);k++) System.out.print(A[k]+" ");



	}
}