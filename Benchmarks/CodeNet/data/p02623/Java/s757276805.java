import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		long K=sc.nextLong();
		long[] A=new long[N];
		long[] B=new long[M];
		long[] Asum=new long[N+1];
		long[] Bsum=new long[M+1];

		Asum[0]=0;
		long sum=0;
		for (int i = 0; i < N; i++) {
			A[i]=sc.nextLong();
			sum+=A[i];
			Asum[i+1]=sum;
		}

		Bsum[0]=0;
		sum=0;
		for (int i = 0; i <M; i++)  {
			B[i]=sc.nextLong();
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