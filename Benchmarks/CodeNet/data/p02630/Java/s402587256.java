import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int ans=0;

		for(int i = 0;i<N;i++) {
			A[i]= sc.nextInt();
		}

		int Q = sc.nextInt();
		int B[] = new int[Q];
		int C[] = new int[Q];

		for(int i = 0;i<Q;i++) {
			B[i]= sc.nextInt();
			C[i]= sc.nextInt();
		}

		for(int i = 0;i<Q;i++) {
			for(int j = 0;j<N;j++) {
				if(A[j]==B[i]) {
					A[j]=C[i];
				}
			}
			for(int k = 0;k<N;k++) {
				ans=ans+A[k];
			}
			System.out.println(ans);
			ans=0;
		}
	}

}