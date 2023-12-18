import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int r[] = new int[n];


		for (int i=0;i<n;++i){
			r[i]= sc.nextInt();
		}

		int profit=r[1]-r[0];

		int point[] = new int[n];
		int k=1;
		point[0]=0;

		if (n==2) point[k]=1;
		else{
			for (int i=1;i<n-1;++i){
				if ((r[i]-r[i-1])*(r[i+1]-r[i])<=0){
					point[k]=i;
					++k;
				}
			}
		}

		point[k]=n-1;

		for (int i=0;i<=k-1;++i){
			for (int j=1+i;j<=k;++j){
				profit = Math.max(profit, r[point[j]]-r[point[i]]);
			}
		}

		System.out.println(profit);
	}

}
