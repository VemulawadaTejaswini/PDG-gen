import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		long K=sc.nextLong();
		long[] Asum=new long[N+1];
		long[] Bsum=new long[M+1];

		Asum[0]=0;
		long sum=0;
		for (int i = 1; i < N+1; i++) {
			sum+=sc.nextLong();
			Asum[i]=sum;
		}

		Bsum[0]=0;
		sum=0;
		for (int i = 1; i <M+1; i++)  {
			sum+=sc.nextLong();
			Bsum[i]=sum;
		}

		int ans=0, jj=0;
		for (int i = 0; i <N+1; i++) {
			if(Asum[i]>K)  break;

			for (int j = 0; j <M+1; j++) {
				jj=j;
				if(K-Asum[i]< Bsum[j])  break;
			}

			ans=Math.max(ans, i+jj);
		}
		System.out.println(ans);
	}
}