import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();
		int[] A=new int[N];
		int[] B=new int[M];

		for (int i = 0; i < N; i++) A[i]=sc.nextInt();
		for (int i = 0; i <M; i++)  B[i]=sc.nextInt();

		int ans=0;
		int sumN=0;
		int sum=0;
		for (int i = -1; i < N; i++) {
			int newans=i+1;
			if(i>-1) {
				sumN+=A[i];
				if(sumN>K) break;
				sum=sumN;
			}
			for (int j = 0; j < M; j++) {
				sum+=B[j];
				newans++;

				if(sum>K) {
					newans--; break;
				}
			}		
			if(newans>ans)ans=newans;
		}
		System.out.println(ans);
	}
}
