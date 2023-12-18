import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();
		int[] A=new int[N];
		int[] B=new int[M];
		int[] Asum=new int[N+1];
		int[] Bsum=new int[M+1];

		Asum[0]=0;
		int sum=0;
		for (int i = 0; i < N; i++) {
			A[i]=sc.nextInt();
			sum+=A[i];
			Asum[i+1]=sum;
		}

		Bsum[0]=0;
		sum=0;
		for (int i = 0; i <M; i++)  {
			B[i]=sc.nextInt();
			sum+=B[i];
			Bsum[i]=sum;
		}

		int ans=0, jj=0;
		for (int i = 0; i <=N; i++) {
			if(Asum[i]>K)  break;

			for (int j = 0; j <=M; j++) {
				jj=j;
				if(Bsum[j]>K-Asum[i])  break;
			}

			ans=Math.max(ans, i+jj);
		}
		System.out.println(ans);
	}
}