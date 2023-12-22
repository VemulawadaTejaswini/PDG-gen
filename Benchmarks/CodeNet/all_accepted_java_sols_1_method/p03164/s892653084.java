import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxW = sc.nextInt();

		long[] weight = new long[n*1000+1];
		
		for (int i=1;i<=n*1000;i++) {
			weight[i] = Long.MAX_VALUE/2;
		}


		for (int i=0;i<n;i++) {
			int w = sc.nextInt();
			int v = sc.nextInt();
			for (int j=n*1000-v;j>=0;j--) {
				weight[j+v]=Math.min(weight[j+v],weight[j]+w);
			}
		}

		long ans = 0;
		for (int i=0;i<=n*1000;i++) {
			if (weight[i]<=maxW) {
				ans = i;
			}
		}
		System.out.println(ans);
	}

}